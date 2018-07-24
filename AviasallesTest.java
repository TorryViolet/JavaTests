packege org.selenide.examples;

import static com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class AviaSearch {
   @Before
    public void search() {
    open("https://www.aviasales.ru");  
    $(By.id(".//input[@id='origin']").setValue("MOW");
    $(By.id(".//input[@id='destination']").setValuse("LED");
    $(By.xpath(".//button[@class='pika-next']").click().click();
    $(By.xpath(".//div[@class='of_datepicker of_datepicker--left']//td[@data-day="25"]").click();
    $(By.type("#submit").click();
}

    @ResultsPage
    public void resultsOfSearch() {
    $$(By.xpath(".//div[@class="product-list"]").shoudHave.size(10);
}



