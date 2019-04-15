package com.ozlemgncn.junittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//SuitCase : gruplayarak test yapma işlemini sağlar.
@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	AssertKolayTest.class,
	AssertTest.class,
	ParametreTest.class,
	YasamDongusuTest.class
	
})
public class SuiteTets {

}
