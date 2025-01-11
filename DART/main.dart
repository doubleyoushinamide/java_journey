import 'dart:io';

void main() {
  print('Hello Dart!');

  print('What is your name?');
  String? name = stdin.readLineSync();

  if (name != null) {
    int number = int.parse(name);
    print('Hello $number');
  } else {
    print('Empty name input');
  }
}
