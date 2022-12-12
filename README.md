# Neverwinter_UI_Tests

# Проект по автоматизации IBS


## 🚀: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Примеры использования](#earth_africa-Allure-отчет)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## 🧰: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## ⚓: Реализованные проверки

Тест 1
- ✓ Открыть сайт ibs.ru
- ✓ Нажать на кнопку "Принимаю условия" (cookie)
- ✓ Сменить язык содержимого сайта на английский (ENG)
- ✓ Перейти в раздел Technology Partners
- ✓ Расширить список отображаемых партнеров, нажав на кнопку SHOW
- ✓ Проверить что среди отображаемых партнеров есть ROBIN Partner

Тест 2
- ✓ Выполнить поиск компании IBS
- ✓ Проверить что в названии присутствует текст "IBS — ведущая российская IT-сервисная компания"


## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins <a target="_blank" href="https://jenkins.autotests.cloud/job/IBS_test/"> job </a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/IBS_test/"><img src="images/screens/jenkins.PNG" alt="Jenkins"/></a>
</p>


## 🧙: Параметры сборки в Jenkins:

- Browser (браузер, по умолчанию chrome)
- Version (версия браузера, по умолчанию 91.0)
- Browser_size (размер окна браузера, по умолчанию 1920x1080)



## 🏗️: Запуск тестов из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-Dversion=${VERSION}
-Dsize=${BROWSER_SIZE}
-Durl=${REMOTE_URL}
```

# Примеры использования

### Для запуска удаленных тестов необходимо заполнить remote.properties или передать значение:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Запускайте тесты с заполненным remote.properties:
```bash
gradle clean test
```

Запускайте тесты с незаполненным remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Выдать отчет:
```bash
allure serve build/allure-results
```
## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/IBS_test/allure/">Allure report</a>

## ⛅: Основной отчет
<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/report.PNG">
</p>
C:\Users\maver\IBS-tests\images\screens\report.PNG

## 🧪: Тесты
<p align="center">
<img title="Allure Tests" src="images/screens/tests.PNG">
</p>

## 💹: Графики
<p align="center">
<img title="Allure Tests" src="images/screens/chart.PNG">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/notif.PNG" >
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25" alt="Jenkins"/></a> Видео <a target="_blank" href="https://selenoid.autotests.cloud/video/fe43b9f89a795109ff4959044e6650d7.mp4"> прохождения тестов </a>
<p align="center">
<a href="https://selenoid.autotests.cloud/video/fe43b9f89a795109ff4959044e6650d7.mp4"></a>
</p>
