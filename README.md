# 🎵 SoundLog

SoundLog is a simple desktop application that lets a group of friends share song links (Spotify, Apple Music, or YouTube) and leave reviews or thoughts on them — with the option to post under a username or anonymously. No social media account required, just a lightweight shared space for music opinions.

Built as a personal project to combine skills from **Advanced OOP (Java)** and **Database Management (MySQL)** into one functioning full-stack desktop application.

---

## ✨ Features

- Add a song by pasting a Spotify, Apple Music, or YouTube link
- Automatic platform detection from the link using regex
- Leave a written review and a 1–5 star rating on any song
- Choose to post under your account or anonymously
- User registration and login with securely hashed passwords (BCrypt)
- All data shared across users via a centrally hosted MySQL database

---

## 🛠️ Tech Stack

| Layer            | Technology                          |
|-------------------|--------------------------------------|
| UI                | JavaFX                              |
| Language          | Java                                |
| Database          | MySQL (hosted on [Aiven](https://aiven.io)) |
| DB Connectivity   | JDBC (MySQL Connector/J)            |
| Password Security | BCrypt                              |
| IDE               | Eclipse                             |

---

## 🏗️ Architecture

This project follows a simple **2-tier architecture** with a clean separation of concerns inspired by the **DAO (Data Access Object) pattern**:
