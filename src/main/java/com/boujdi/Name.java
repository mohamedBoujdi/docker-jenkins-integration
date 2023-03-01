package com.boujdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    //to handle names in many langugages
   String country = Locale.getDefault().getCountry();
   String countryname = Locale.getDefault().getDisplayCountry();
   String countrylanguage = Locale.getDefault().getLanguage();

   String  firstname ;
   String midlename;
   String lastname ;

}
