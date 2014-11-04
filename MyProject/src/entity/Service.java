package entity;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Tatyana_Em on 04.11.14.
 */
public class Service {

    enum category {
        PHOTO,
        VIDEO,
    }

    enum type {
        WEDDING,
        BDAY,
        PORTFOLIO,
        OTHER,
    }

    private int idService;
    private String nameService;
    private Integer priceService;
    private String descriptionService;
    private int idCategoryService;
    private int idTypeService;


    public void createService(){

    }

}
