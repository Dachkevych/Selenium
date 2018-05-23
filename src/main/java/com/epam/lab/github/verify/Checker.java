package com.epam.lab.github.verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Checker {

    private List<WebElement> lists;

    @FindBy(xpath = "//div[@class='d-flex flex-justify-between border-bottom pb-3']/h3")
    private WebElement resultCount;

    public void verifyTagName(final String tagName, WebDriver driver) {
//        Thread.sleep(3000);
        lists = driver.findElements(By.xpath("//div[@class='col-8 pr-3']"));
        int countTag = ((int) lists.stream().filter(el -> el.getText().contains(tagName)).count());
        System.out.println("Result verify tag: " + countTag + " from " + lists.size() + " tags contains tag - " + tagName);
        printResult(tagName);
    }

    public void printResult(final String tagName) {
        lists.stream().filter(el -> el.getText().contains(tagName)).forEach(elm -> System.out.println(elm.findElement(By.className("v-align-middle")).getText()));
    }

    public void getResultCount(WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//h3[contains(text(), 'repository results')]"));
        System.out.println(element.getText());
    }
}
