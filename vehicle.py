from __future__ import annotations


class Vehicle:
    __brand: str
    __model: str
    __price: float
    __max_speed: int
    __weight: int

    def __init__(self, brand: str, model: str, price: float, max_speed: int, weight: int) -> None:
        if weight < 0:
            self.__weight = 0
        else:
            self.__weight = weight
        if max_speed < 30:
            self.__max_speed = 30
        else:
            self.__max_speed = max_speed
        self.__brand = brand
        self.__model = model
        self.__price = price

    @property
    def brand(self) -> str:
        return self.__brand

    @brand.setter
    def brand(self, brand: str) -> None:
        if type(brand) != str:
            raise ValueError("Brand should be a string")
        else:
            self.__brand = brand

    @property
    def model(self) -> str:
        return self.__model

    @model.setter
    def model(self, model: str) -> None:
        if type(model) != str:
            raise ValueError("Model should be a string")
        else:
            self.__model = model

    @property
    def price(self) -> float:
        return self.__price

    @price.setter
    def price(self, price: float) -> None:
        if type(price) != float:
            raise ValueError("Price should be a float")
        else:
            self.__price = price

    @property
    def max_speed(self) -> int:
        return self.__max_speed

    @max_speed.setter
    def max_speed(self, max_speed: int) -> None:
        if max_speed < 30:
            self.__max_speed = 30
        else:
            self.__max_speed = max_speed

    @property
    def weight(self) -> int:
        return self.__weight

    @weight.setter
    def weight(self, weight: int) -> None:
        if weight < 0:
            self.__weight = 0
        else:
            self.__weight = weight

    def price_increase(self, percent: float):
        percent = percent * 0.01
        cena = self.price
        self.price = cena * percent + cena
        return self.price

    def __str__(self) -> str:
        return f"Szczegóły:\nMarka {self.brand}\nModel {self.model}\n" \
               f"Cena {self.price}\nMaksymalna prędkość {self.max_speed}\nWaga {self.weight}"

    def __add__(self, other: Vehicle):
        return self.__weight + other.__weight and self.__max_speed - 20
