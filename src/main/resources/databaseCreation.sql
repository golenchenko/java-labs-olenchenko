-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3307
-- Время создания: Мар 23 2024 г., 17:56
-- Версия сервера: 10.4.12-MariaDB
-- Версия PHP: 7.4.14

SET
SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET
time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `olenchenko`
--

-- --------------------------------------------------------

--
-- Структура таблицы `students`
--

CREATE TABLE `students`
(
    `id`          int(11) NOT NULL,
    `surname`     varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `name`        varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `patronymic`  varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    `birthday`    timestamp NOT NULL                      DEFAULT current_timestamp(),
    `record_book` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `students`
--

INSERT INTO `students` (`id`, `surname`, `name`, `patronymic`, `birthday`, `record_book`)
VALUES (1, 'Оленченко', 'Георгій', 'Михайлович', '2003-04-08 15:29:33', 12345678),
       (2, 'Їжак', 'Явдоха', 'Олегівна', '2002-09-17 15:35:43', 45464116),
       (3, 'Радецька', 'Орина', 'Левівна', '2001-04-07 15:35:54', 48474411),
       (4, 'Ігнатюк', 'Чеслава', 'Жданівна', '2001-04-24 15:36:02', 22666658),
       (5, 'Юровська', 'Агнеса', 'Златівна', '2003-11-28 16:36:11', 74511311),
       (6, 'Ульянченко', 'Біловид', 'Миколайович', '2000-12-31 16:36:18', 41841161),
       (7, 'Журавська', 'Ельвіра', 'Глібівна', '2004-02-29 16:36:27', 12211548),
       (8, 'Єрмоленко', 'Ревун', 'Соломонович', '2001-11-18 16:36:49', 29198161),
       (9, 'Авдієвський', 'Ведан', 'Любомирович', '2002-04-23 15:36:57', 49813511),
       (10, 'Яневич', 'Устим', 'Богданович', '2003-05-09 15:37:04', 78711818),
       (11, 'Цегельска', 'Алевтина', 'Устимівна', '2003-03-25 16:37:11', 3116468),
       (12, 'Щербатюк', 'Царук', 'Йосипович', '2001-07-31 15:37:16', 45151651),
       (13, 'Їжакевич', 'Корній', 'Ігорович', '1999-09-03 15:37:24', 1515151),
       (14, 'Удовиченко', 'Юрій', 'Милославович', '2002-09-25 15:37:36', 54645484),
       (15, 'Титла', 'Богуслав', 'Чеславович', '2004-07-30 15:37:45', 65556),
       (16, 'Чемерис', 'Феодора', 'Богданівна', '2002-08-23 15:37:57', 1551511),
       (17, 'Радиловська', 'Текля', 'Тихонівна', '2003-02-28 16:38:03', 12487526),
       (18, 'Нетреба', 'Хотян', 'Жданович', '2002-08-13 15:38:12', 14411515),
       (19, 'Єременко', 'Свободана', 'Герасимівна', '2003-07-28 15:38:19', 45675857),
       (20, 'Гребенюк', 'Рина', 'Олегівна', '2004-04-02 15:38:26', 1550555);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `students`
--
ALTER TABLE `students`
    ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `students`
--
ALTER TABLE `students`
    MODIFY `id` int (11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
