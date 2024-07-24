CREATE DATABASE surat;
USE surat;
CREATE TABLE pengguna(
	nama VARCHAR (250),
	username VARCHAR (250),
	passw VARCHAR (250),
	statusp VARCHAR (250)
);
CREATE TABLE masuk(
	no_surat VARCHAR (250),
	tanggal_terima VARCHAR (250),
	terima_dari VARCHAR (250),
	isi_prihal VARCHAR (250),
	lampiran VARCHAR (3),
	keterangan VARCHAR (250),
	gambar BLOB
);
CREATE TABLE keluar(
	no_surat VARCHAR (250),
	tanggal VARCHAR (250),
	isi_prihal VARCHAR (250),
	tujuan VARCHAR (3),
	lampiran VARCHAR (250),
	gambar BLOB
);