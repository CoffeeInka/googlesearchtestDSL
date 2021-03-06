package core.entities.collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static core.ConciseAPI.getDriver;


public class LazyWebDriverCollection extends AbstractLazyCollection {

    private By locator;

    public LazyWebDriverCollection(By locator) {
        this.locator = locator;
    }

    @Override
    public List<WebElement> getWrappedEntity() {
        return getDriver().findElements(locator);
    }

    @Override
    public String toString() {
        return locator.toString();
    }
}
