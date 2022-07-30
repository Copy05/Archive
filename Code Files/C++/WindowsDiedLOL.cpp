#include <Windows.h>
#include <time.h>

int WindowsDied()
{
    int msgboxID = MessageBox(
        NULL,
        (LPCWSTR)L"Windows has died!",
        (LPCWSTR)L"Microsoft Windows",
        MB_ICONERROR | MB_OK
    );
    return msgboxID;
}

int _stdcall WinMain(HINSTANCE(a), HINSTANCE(b), LPSTR(c), int(d))
{
    int plus = 1;
    srand(time(0));
    while (true) {
        int randomizedInterval = rand() % 720000 + plus;
        Sleep(randomizedInterval);

        WindowsDied();

        if (plus > 100000) {
            plus = 1;
        }
        else {
            plus += 1000;
        }
    }
}