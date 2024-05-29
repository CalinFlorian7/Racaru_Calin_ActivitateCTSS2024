package teste.suite;


import clase.PachetTuristicTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTestFixture;
import teste.PersoanaTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTests.class, PachetTuristicTestFixture.class})
public class SuitaCompleta {
}
