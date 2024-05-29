package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.dubluri.CuFake;

@RunWith(Categories.class)
@Suite.SuiteClasses(SuitaCompleta.class)
@Categories.IncludeCategory(CuFake.class)

public class SuitaCustom {
}
