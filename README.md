# Findem Android App

Findem is an Android app that leverages the power of machine learning and facial recognition to identify unattended children by comparing their faces against a registered database of missing children. The app utilizes MLKit and FaceNet, along with custom ML models developed using Python, to achieve accurate and efficient facial recognition.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Child abduction is a serious concern, and finding missing children quickly is of utmost importance. The Findem app provides a simple yet powerful tool to help law enforcement and concerned individuals identify unattended children by comparing their facial features with a registered official database of missing children.

## Features

- **Facial Recognition**: The app allows users to capture a photo of an unattended child and perform facial recognition to compare it with the official database of missing children's faces.

- **Offline Mode**: Not implemented yet

- **Custom Machine Learning Models**: The app utilizes custom ML models developed using Python and FaceNet to ensure accurate and reliable facial recognition.

- **User-Friendly Interface**: Findem features an intuitive and user-friendly interface that simplifies the process of capturing and comparing faces.

## Technologies Used

The following technologies have been used to develop the Findem Android app:

- **MLKit**: MLKit is a machine learning framework provided by Google that enables the integration of machine learning features into Android applications.

- **FaceNet**: FaceNet is a deep learning model used for face recognition tasks. It is employed to extract facial features and perform facial embeddings for efficient comparisons.

- **Android Java**: The Android app is developed using Java, which is the primary programming language for Android application development.

- **Python**: Python has been used to develop custom machine learning models for facial recognition. Various libraries like TensorFlow and Keras have been utilized for this purpose.

- **(Optional) Firebase**: Firebase can be integrated into the app to enable real-time synchronization with the official database of missing children.

- **(Optional) SQLite**: Local SQLite database can be used for storing the official database of missing children's facial embeddings for offline comparison.

## Installation

To install the Findem app on your Android device, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in Android Studio.
3. Connect your Android device to your computer or use an emulator.
4. Build and install the app on your Android device using Android Studio.

## Usage

1. Launch the Findem app on your Android device.
2. Grant necessary permissions for camera access.
3. Capture a clear photo of the unattended child's face.
4. The app will perform facial recognition and display the results.
5. If a match is found with the registered database, relevant information about the missing child will be displayed.

## Contributing

Contributions to Findem are welcome! If you wish to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive commit messages.
4. Push your changes to your forked repository.
5. Submit a pull request to the main repository.

Please ensure your code follows the project's coding standards and practices.

## License

Findem is Developed and released by Selva-Viswanath under the [MIT License](LICENSE.md). You are free to use, modify, and distribute the code for both commercial and non-commercial purposes.
