from selenium.webdriver import Chrome
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

url= './xls_pyauto_selenium/chromedriver.exe'

web = Chrome(url)
web.get('http://www.naver.com')

elem = web.find_element(By.ID, 'query')
elem.send_keys('제주도 여행')
time.sleep(1)
elem.send_keys(Keys.ENTER)
time.sleep(1)
elem = web.find_element(By.LINK_TEXT,'이미지')
time.sleep(1)
elem.click()
time.sleep(1)
elem = web.find_elements(By.CSS_SELECTOR,'.sp_nimage .photo_tile .photo_bx .link_thumb>img')

for i in range(3):
    elem[i].click()
    time.sleep(1)

time.sleep(2)
web.quit()