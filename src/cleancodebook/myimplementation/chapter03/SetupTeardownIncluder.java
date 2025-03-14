package cleancodebook.myimplementation.chapter03;

import clean.code.myimplementation.added.to.make.code.build.*;

public class SetupTeardownIncluder {
    private final PageData pageData;
    private final WikiPage testPage;
    private final StringBuilder newPageContent;
    private boolean isSuite;

    private SetupTeardownIncluder(PageData pageData) {
        this.pageData = pageData;
        this.testPage = pageData.getWikiPage();
        this.newPageContent = new StringBuilder();
    }

    public static String render(PageData pageData) {
        return render(pageData, false);
    }

    private static String render(PageData pageData, boolean isSuite) {
        return new SetupTeardownIncluder(pageData)
                .render(isSuite);
    }

    public String render(boolean isSuite) {
        this.isSuite = isSuite;
        if (isTestPage()) {
            includeSetupAndTeardownPages();
        }
        return pageData.getHtml();
    }

    public boolean isTestPage() {
        return this.pageData.hasAttribute("Test");
    }


    private void includeSetupAndTeardownPages() {
        includeSetupPage();
        includePageContent();
        includeTearDownPage();
        updatePageContent();
    }

    private void includeSetupPage() {
        if (this.isSuite) {
            include(SuiteResponder.SUITE_SETUP_NAME, "!include -setup .");
        }
        include("SetUp", "-setup");
    }

    private void includePageContent() {
        newPageContent.append(pageData.getContent());
    }

    private void includeTearDownPage() {
        include("TearDown", "-teardown");
        if (this.isSuite) {
            include(SuiteResponder.SUITE_TEARDOWN_NAME, "!include -teardown .");
        }
    }

    private void updatePageContent() {
        pageData.setContent(newPageContent.toString());
    }

    private void include(String suiteSetupName, String str) {
        WikiPage suiteSetup = getInheritedPage(suiteSetupName);
        if (suiteSetup != null) {
            WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
            String pagePathName = PathParser.render(pagePath);
            newPageContent.append("\n!include ").append(str).append(" .").append(pagePathName).append("\n");
        }
    }

    private WikiPage getInheritedPage(String suiteSetupName) {
        return PageCrawlerImpl.getInheritedPage(suiteSetupName, this.testPage);
    }
}