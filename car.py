from __future__ import annotations
from vehicle import Vehicle


class Car(Vehicle):
    __fuel_type: str

    def __init__(self, brand: str, model: str, price: float, max_speed: int, weight: int, fuel_type: str) -> None:
        super().__init__(brand, model, price, max_speed, weight)
        if max_speed < 130:
            self.__max_speed = 130
        else:
            self.__max_speed = max_speed
        self.__fuel_type = fuel_type
        self.__brand = brand
        self.__model = model
        self.__price = price
        self.__weight = weight

    @property
    def fuel_type(self) -> str:
        return self.__fuel_type

    @fuel_type.setter
    def fuel_type(self, fuel_type: str) -> None:
        if type(fuel_type) != str:
            raise ValueError("fuel_type should be a string")
        else:
            self.__fuel_type = fuel_type

    @property
    def max_speed(self) -> int:
        return self.__max_speed

    @max_speed.setter
    def max_speed(self, max_speed: int) -> None:
        if max_speed < 130:
            self.__max_speed = 130
        else:
            self.__max_speed = max_speed

    def __str__(self) -> str:
        return f"Szczegóły:\nMarka {self.brand}\nModel {self.model}\n" \
               f"Cena {self.price}\nMaksymalna prędkość {self.max_speed}\n" \
               f"Waga {self.weight}\nTyp paliwa: {self.fuel_type}"

    def __add__(self, other: Car):
        return self.__weight + other.__weight and self.__max_speed - 10
