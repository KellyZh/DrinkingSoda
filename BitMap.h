#include <iostream>
#include <fstream>

typedef unsigned long DWORD;
typedef unsigned int WORD;
typedef uint16_t UINT16;
typedef long LONG;
typedef byte BYTE;

typedef struct tagBITMAPFILEHEADER
{
    UINT16 bfType;   //2 Bytes,must be "BM",which "0x424D" is windows bitmap file
    DWORD bfSize;
    UINT16 bfReserved1;  //reserved data 1
    UINT16 bfReserved2;  //reserved data 2
    DWORD bfBffBits;   //offsets for the begin of file to image data
} BITMAPFILEHEADER;

typedef struct tagBITMAPINFOHEADER
{
    DWORD biSize;    //4 Bytes,MAPINFOHEADER structure's size
    LONG biWidth;    //4 Bytes,image width (px)
    LONG biHeight;    //4 Bytes,image height (px)
    WORD biPlanes;
    WORD biBitCount;
    DWORD biCompression;
    DWORD biSizeImage;
    LONG biXPelsPerMeter;
    LONG biYPelsPerMeter;
    DWORD biClrUsed;
    DWORD biClrImportant;
} BITMAPINFOHEADER;

typedef struct tagRGBQUAD
{
    BYTE rgbBlue;
    BYTE rgbRed;
    BYTE rgbGreen;
    BYTE rgbReserved;
} RGBQUAD;

typedef struct tagBITMAPINFO
{
    BITMAPINFOHEADER bmiHeader;
    RGBQUAD bmiCOlors[1];
} BITMAPINFO;

