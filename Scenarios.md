#Feature: To Verify Financial Review Page

URL:- https://www.afr.com/companies

## Scenario 1:
Test to Verify 'Companies in the news' section

##Steps:-
1. **Given** Browse through financial review webpage 'https://www.afr.com/companies'
2. **And** Scroll down to the 'COMPANIES IN THE NEWS' section
3. **Then** Verify 'COMPANIES IN THE NEWS' label is present
4. **And** Verify 6 different companies are listed - ANZ Bank, AMP, Commonwealth Bank, Qantas, Westpac, Virgin Australia
5. **Then** Verify 'Search companies' section is present and search any 'ASX listed' bank name in search bar.
6. **And** Verify All Companies link is present.
7. **Then** Click on All Companies link will take you to next page where list of all companies is present

## Scenario 2:
Test to Verify 'Companies in the news' section different companies links are clickable

##Steps:-
1. **Given** Browse through financial review webpage 'https://www.afr.com/companies'
2. **And** Scroll down to the 'COMPANIES IN THE NEWS' section
3. **Then** Verify 'COMPANIES IN THE NEWS' label is present
4. **And** Verify 6 different companies are listed - ANZ Bank, AMP, Commonwealth Bank, Qantas, Westpac, Virgin Australia
5. **Then** Click On First Bank - ANZ Bank 
6. **Then** Verify ANZ Bank page is open and share values are listed
7. **Then** Come back to previous page
8. **Then** Click On Second Bank - AMP Bank
9. **Then** Verify ANZ Bank page is open and share values are listed
10. **Then** Come back to previous page
11. **Then** Similarly check other banks

## Scenario 3:
Test to Verify 'Companies in the news' Virgin Australia bank

##Steps:-
1. **Given** Browse through financial review webpage 'https://www.afr.com/companies'
2. **And** Scroll down to the 'COMPANIES IN THE NEWS' section
3. **Then** Verify 'COMPANIES IN THE NEWS' label is present
4. **And** Verify 6 different companies are listed - ANZ Bank, AMP, Commonwealth Bank, Qantas, Westpac, Virgin Australia
5. **Then** Verify Virgin Australia has share prices and share percentage listed
6. **When** Click On Virgin Australia link
7. **Then** Verify Virgin Australia Bank page is open
8. **And** Verify content of Virgin Australia Bank


