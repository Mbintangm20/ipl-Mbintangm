<?php
include "koneksi.php";

// Proses penambahan pesan
if(isset($_POST['proses_tambah'])){
    $idPesan = isset($_POST['idPesan']) ? $_POST['idPesan'] : '';
    $idPenerima = isset($_POST['idPenerima']) ? $_POST['idPenerima'] : '';
    $idPengirim = isset($_POST['idPengirim']) ? $_POST['idPengirim'] : '';
    $judul = isset($_POST['Judul']) ? $_POST['Judul'] : '';
    $textPesan = isset($_POST['TextPesan']) ? $_POST['TextPesan'] : '';
    $waktuPesan = isset($_POST['WktPesan']) ? $_POST['WktPesan'] : '';

    mysqli_query($koneksi, "INSERT INTO pesan SET
    idPesan = '$idPesan',
    idPenerima = '$idPenerima',
    idPengirim = '$idPengirim',
    Judul = '$judul',
    TextPesan = '$textPesan',
    WktPesan = '$waktuPesan'");

    echo "Pesan berhasil ditambahkan";
}

// Menampilkan data pesan
$result = mysqli_query($koneksi, "SELECT * FROM pesan");
echo "<h3>Daftar Pesan</h3>";
echo "<table border='1'>
    <tr>
        <th>Id Pesan</th>
        <th>Id Penerima</th>
        <th>Id Pengirim</th>
        <th>Judul</th>
        <th>Text Pesan</th>
        <th>Waktu Pesan</th>
        <th>Aksi</th>
    </tr>";

while ($row = mysqli_fetch_assoc($result)) {
    echo "<tr>
        <td>{$row['idPesan']}</td>
        <td>{$row['idPenerima']}</td>
        <td>{$row['idPengirim']}</td>
        <td>{$row['Judul']}</td>
        <td>{$row['TextPesan']}</td>
        <td>{$row['WktPesan']}</td>
        <td><a href='?hapus&idPesan={$row['idPesan']}'>Hapus</a></td>
    </tr>";
}

echo "</table>";

// Proses penghapusan pesan
if (isset($_GET['hapus'])) {
    $idPesan = $_GET['idPesan'];
    mysqli_query($koneksi, "DELETE FROM pesan WHERE idPesan = '$idPesan'");
    header("Location: Form_TambahPesan.php");
}
?>

<h3> Tambah Pesan </h3>

<form action="" method="post">
    <table>
        <tr>
            <td width="130">Id Pesan</td>
            <td><input type="text" name="idPesan"></td>
        </tr>
        <tr>
            <td width="130">Id Penerima</td>
            <td><input type="text" name="idPenerima"></td>
        </tr>
        <tr>
            <td width="130">Id Pengirim</td>
            <td><input type="text" name="idPengirim"></td>
        </tr>
        <tr>
            <td width="130">Judul</td>
            <td><input type="text" name="Judul"></td>
        </tr>
        <tr>
            <td width="130">Text Pesan</td>
            <td><input type="text" name="TextPesan"></td>
        </tr>
        <tr>
            <td>Waktu Pesan</td>
            <td><input type="text" name="WktPesan" value="<?php echo date("Y-m-d");?>"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Tambah Pesan" name="proses_tambah"></td>
        </tr>
    </table>
</form>