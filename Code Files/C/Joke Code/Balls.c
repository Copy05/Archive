#include <stdio.h>
#include <Windows.h>

int main()
{
	char ballsack = 'O';
	char balls[3] = { ballsack, ballsack, '\0' };

	printf(balls);
	Sleep(2000);
}