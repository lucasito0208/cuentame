package es.alten.cuentame.web;

import es.alten.cuentame.web.NavSection.NavSectionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NavSectionTest {

  private static final String SECTION_LIST_TITLE = "section.list.title";
  private static final String SECTION_TITLE = "section.title";
  private static final String SECTION = "section";
  NavSection navSection;

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void test_getTitle_detail() {
    navSection = new NavSection(SECTION, NavSectionType.DETAIL);

    String titleKey = navSection.getTitle();
    Assertions.assertEquals(SECTION_TITLE, titleKey);
  }

  @Test
  void test_getTitle_LIST() {
    navSection = new NavSection(SECTION, NavSectionType.LIST);

    String titleKey = navSection.getTitle();
    Assertions.assertEquals(SECTION_LIST_TITLE, titleKey);
  }

  @Test
  void test_getTitle_PROFILE() {
    navSection = new NavSection(SECTION, NavSectionType.PROFILE);

    String titleKey = navSection.getTitle();
    Assertions.assertEquals(SECTION_TITLE, titleKey);
  }
}
