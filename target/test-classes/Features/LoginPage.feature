Feature: verifying adactinhotelapp details

  Scenario Outline: Verifying adactinhotelapp details
    Given I am on the adactinhotelapp login page
    When I should enter invalid "<userName>" and "<passWord>"
    And user should serach hotel  using "<location>","<hotel>","<roomType>","<noofRooms>","<checkinDate>","<checkoutDate>","<adultsPerRooms>","<childPerRooms>"
    Then I should select Hotel

    Examples: 
      | userName   | passWord   | location | hotel       | roomType     | noofRooms | checkinDate | checkoutDate | adultsPerRooms | childPerRooms |
      | idris1997k | qwerty@123 | Sydney   | Hotel Creek | Super Deluxe |         2 | 28/10/2020  | 28/10/2020   | 3 - Three      | 3 - Three     |
