package cleancodebook.myimplementation.chapter14.refactored.second;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static clean.code.book.chapter14.refactored.second.ArgsException.ErrorCode.MISSING_STRING;

public class StringArgumentMarshaler implements ArgumentMarshaler {
  private String stringValue = "";

  public void set(Iterator<String> currentArgument) throws ArgsException {
    try {
      stringValue = currentArgument.next();
    } catch (NoSuchElementException e) {
      throw new ArgsException(MISSING_STRING);
    }
  }

  public Object get() {
    return stringValue;
  }
}