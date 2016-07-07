# language: pl
Funkcja: Informacja dla podróżnych o czasie przybycia do stacji docelowej
	W celu bardziej efektywnego planowania podróży
	Jako podróżny
	Chcę wiedzieć, o której godzinie dotrę do stacji docelowej

Szablon Scenariusza: Szacowanie czasu przyjazdu
	Zakładając że chcę się dostać z "Epping" do "Central"
	I nastepny pociąg odjeżdża o <czas_odjazdu> na linii "<linia>"
	Gdy zapytam o godzinę przyjazdu
	Wtedy powinienem uzyskać następujący szacowany czas przyjazdu: <czas_przyjazdu>

	Przykłady:
		| czas_odjazdu	| linia		| czas_przyjazdu	|
		| 8:03         	| Northern	| 8:48           	|
		| 8:07			| Newcastle	| 8:37				|
		| 8:07			| Newcastle	| 8:37				|
		| 8:13			| Epping	| 8:51				|