package com.learnings.junit.suites;

import com.learnings.junit.helper.ArraysSortMethodTest;
import com.learnings.junit.helper.SampleBeforeAfterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArraysSortMethodTest.class, SampleBeforeAfterTest.class})
public class SampleTestSuite {
}
