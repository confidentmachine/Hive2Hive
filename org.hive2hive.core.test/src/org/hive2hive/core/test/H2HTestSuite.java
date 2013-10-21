package org.hive2hive.core.test;

import org.hive2hive.core.network.Connection;
import org.hive2hive.core.test.flowcontrol.ProcessManagerTest;
import org.hive2hive.core.test.flowcontrol.ProcessTest;
import org.hive2hive.core.test.tomp2p.ReplicationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This suit bundles all tests of hive2hive.
 * 
 * @author Seppi
 */
@RunWith(Suite.class)
@SuiteClasses({
		// All tests of Box2Box

		// TomP2P
		ReplicationTest.class,
		
		// Network
		Connection.class,

		// Processes
		ProcessTest.class, ProcessManagerTest.class

})
public class H2HTestSuite {

}