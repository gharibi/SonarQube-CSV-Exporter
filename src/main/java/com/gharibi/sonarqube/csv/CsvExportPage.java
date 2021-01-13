package com.gharibi.sonarqube.csv;

import org.sonar.api.web.page.Context;
import org.sonar.api.web.page.Page;
import org.sonar.api.web.page.PageDefinition;

public class CsvExportPage implements PageDefinition {
    @Override
    public void define(Context context) {
        context.addPage(Page.builder("csvexport/global").setName("CSV Export").build());
    }
}
