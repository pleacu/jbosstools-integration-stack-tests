package org.jboss.tools.modeshape.ui.bot.test.suite;

import junit.framework.TestSuite;

import org.jboss.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.modeshape.ui.bot.test.PublishingTest;
import org.jboss.tools.modeshape.ui.bot.test.TeiidPublishingTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ PublishingTest.class, TeiidPublishingTest.class })
@RunWith(RedDeerSuite.class)
public class AllTests extends TestSuite {

}
