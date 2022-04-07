{\rtf1\ansi\ansicpg1254\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;\f1\froman\fcharset0 Times-Bold;}
{\colortbl;\red255\green255\blue255;\red25\green26\blue42;\red255\green255\blue255;}
{\*\expandedcolortbl;;\cssrgb\c12941\c13725\c21961;\cssrgb\c100000\c100000\c100000;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid101\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid2}
{\list\listtemplateid3\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid201\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid3}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}{\listoverride\listid3\listoverridecount0\ls3}}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sa440\partightenfactor0

\f0\fs34 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 A\uc0\u351 a\u287 \u305 daki isterlere g\'f6re veri taban\u305  modellemesi yap\u305 n\u305 z. (Ara\u351 t\u305 rma: PostgreSql'de tablo ve kolon ekleme) Veritaban\u305  isminiz hrms olabilir.\
Sistemimiz \'fc\'e7 temel kullan\uc0\u305 c\u305  t\'fcr\'fcne sahiptir. Sistem personeli, \u304 \u351  Arayanlar ve \u304 \u351  verenler. Sistem personeli : Projenizde \'e7al\u305 \u351 an ki\u351 iler. \'d6rne\u287 in Kariyer.Net personeli.\
\pard\pardeftab720\sa440\partightenfactor0

\f1\b \cf2 \'d6NEML\uc0\u304  : Burada ilk etapta veri taban\u305  modeli istiyorum. Kod yazman\u305 z\u305  istemiyorum.
\f0\b0 \

\f1\b Req 1 : \uc0\u304 \u351  Arayanlar sisteme kay\u305 t olabilmelidir.
\f0\b0 \
Kabul Kriterleri:\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sa300\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Kay\uc0\u305 t s\u305 ras\u305 nda kullan\u305 c\u305 dan ad, soyad, tcno, do\u287 um y\u305 l\u305 , e-Posta, \u351 ifre, \u351 ifre tekrar\u305  bilgileri istenir.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 T\'fcm alanlar zorunludur. Kullan\uc0\u305 c\u305  bilgilendirilir.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Mernis do\uc0\u287 rulamas\u305  yap\u305 larak sisteme kay\u305 t ger\'e7ekle\u351 tirilir.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Do\uc0\u287 rulama ge\'e7erli de\u287 ilse kullan\u305 c\u305  bilgilendirilir.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Daha \'f6nce kay\uc0\u305 tl\u305  bir e-posta veya tcno var ise kay\u305 t ger\'e7ekle\u351 mez. Kullan\u305 c\u305  bilgilendirilir.\cb1 \
\ls1\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Kay\uc0\u305 d\u305 n ger\'e7ekle\u351 mesi i\'e7in e-posta do\u287 rulamas\u305  gerekir.\cb1 \
\pard\pardeftab720\sa440\partightenfactor0

\f1\b \cf2 \cb3 Req 2 : \uc0\u304 \u351  verenler sisteme kay\u305 t olabilmelidir.
\f0\b0 \
Kabul Kriterleri:\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sa300\partightenfactor0
\ls2\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Kay\uc0\u305 t s\u305 ras\u305 nda kullan\u305 c\u305 dan \u351 irket ad\u305 , web sitesi, web sitesi ile ayn\u305  domaine sahip e-posta, telefon, \u351 ifre, \u351 ifre tekrar\u305  bilgileri istenir. Burada ama\'e7 sisteme \u351 irket olmayanlar\u305 n kat\u305 lmas\u305 n\u305  engellemektir.\cb1 \
\ls2\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 T\'fcm alanlar zorunludur. Kullan\uc0\u305 c\u305  bilgilendirilir.\cb1 \
\ls2\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 \uc0\u350 irket kay\u305 tlar\u305  iki \u351 ekilde do\u287 rulan\u305 r. Kay\u305 d\u305 n ger\'e7ekle\u351 mesi i\'e7in e-posta do\u287 rulamas\u305  gerekir. HRMS personelinin (bizim :)) onay\u305  gerekmektedir.\cb1 \
\ls2\ilvl0\cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Daha \'f6nce kay\uc0\u305 tl\u305  bir e-posta var ise kay\u305 t ger\'e7ekle\u351 mez. Kullan\u305 c\u305  bilgilendirilir.\cb1 \
\pard\pardeftab720\sa440\partightenfactor0

\f1\b \cf2 \cb3 Req 3 : Sisteme genel i\uc0\u351  pozisyonu isimleri eklenebilmelidir. \'d6rne\u287 in Software Developer, Software Architect.
\f0\b0 \
Kabul Kriterleri:\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sa300\partightenfactor0
\ls3\ilvl0\cf2 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	\uc0\u8226 	}\expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 Bu pozisyonlar tekrar edemez. Kullan\uc0\u305 c\u305  uyar\u305 l\u305 r.\cb1 \
}