package com.epam.lab.github.bo;

import com.epam.lab.github.pages.MainPageGithub;
import com.epam.lab.github.pages.SearchPageGithub;
import org.openqa.selenium.By;

public class GithubSearchPageBO {

   private MainPageGithub mainPageGithub = new MainPageGithub();
   private SearchPageGithub searchPageGithub = new SearchPageGithub();

    public void findProjectsByName(String name) {
        mainPageGithub.inputSearch(name);
    }

    public void changeSort() {
        searchPageGithub.clickSortBtn();
        searchPageGithub.changeSort();
    }

    public void verifyTagName(final String tagName) {
        System.out.println("----------------------------------------------------------------------------");
        getResultCount();
        int countTag = ((int) mainPageGithub.getLists().stream().filter(el -> el.getText().contains(tagName)).count());
        System.out.println("Result verify tag: " + countTag + " from " + mainPageGithub.getLists().size() + " tags contains tag - " + tagName);
        printResult(tagName);
    }

    public void printResult(final String tagName) {
        mainPageGithub.getLists().stream().filter(el -> el.getText().contains(tagName)).forEach(elm -> System.out.println(elm.findElement(By.className("v-align-middle")).getText()));
    }

    public void getResultCount() {
        System.out.println(mainPageGithub.getAmountSearchResult().getText());
    }

    public boolean checkChangeSortSuccess() {
        return searchPageGithub.checkChangeSortSuccess();
    }

    public boolean checkSiginSuccess(){
        return mainPageGithub.checkSiginSuccess();
    }
}
