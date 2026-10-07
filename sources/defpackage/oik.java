package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oik {
    public final File a;
    public final Object b = new Object();
    public DataOutputStream c;

    public oik(File file) {
        this.a = new File(file, wk8.b("5c75586e0a280603023712030b36012e073d06720c311b"));
    }

    public static eik b(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            String utf = dataInputStream.readUTF();
            long j = dataInputStream.readLong();
            long j2 = dataInputStream.readLong();
            String utf2 = dataInputStream.readUTF();
            int i = dataInputStream.readInt();
            String utf3 = dataInputStream.readUTF();
            boolean z = dataInputStream.readBoolean();
            int i2 = dataInputStream.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i3 = 0; i3 < i2; i3++) {
                linkedHashMap.put(Integer.valueOf(dataInputStream.readInt()), new bkk(dataInputStream.readByte()));
            }
            eik eikVar = new eik(utf, j, j2, utf2, i, utf3, z, linkedHashMap);
            dataInputStream.close();
            return eikVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(dataInputStream, th);
                throw th2;
            }
        }
    }

    public static void c(DataOutputStream dataOutputStream, eik eikVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
        try {
            String str = eikVar.a;
            Map map = eikVar.h;
            dataOutputStream2.writeUTF(str);
            dataOutputStream2.writeLong(eikVar.b);
            dataOutputStream2.writeLong(eikVar.c);
            dataOutputStream2.writeUTF(eikVar.d);
            dataOutputStream2.writeInt(eikVar.e);
            dataOutputStream2.writeUTF(eikVar.f);
            dataOutputStream2.writeBoolean(eikVar.g);
            dataOutputStream2.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                byte b = ((bkk) entry.getValue()).a;
                dataOutputStream2.writeInt(iIntValue);
                dataOutputStream2.writeByte(b);
            }
            dataOutputStream2.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            dataOutputStream.writeInt(byteArray.length);
            dataOutputStream.write(byteArray);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(dataOutputStream2, th);
                throw th2;
            }
        }
    }

    public final List a() {
        List listT1;
        synchronized (this.b) {
            listT1 = ww3.T1(e());
        }
        return listT1;
    }

    public final void d(eik eikVar) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    this.c = new DataOutputStream(new FileOutputStream(this.a, true));
                }
                DataOutputStream dataOutputStream = this.c;
                if (dataOutputStream == null) {
                    throw new IllegalArgumentException(wk8.b("af7dbaa8ffc814dbcd9a0edbdadf1cc288d30e8fc6d5098fc1d414dbc1db11c6d2df19").toString());
                }
                c(dataOutputStream, eikVar);
                DataOutputStream dataOutputStream2 = this.c;
                if (dataOutputStream2 == null) {
                    throw new IllegalArgumentException(wk8.b("af7dbaa8ffc814dbcd9a0edbdadf1cc288d30e8fc6d5098fc1d414dbc1db11c6d2df19").toString());
                }
                dataOutputStream2.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List e() throws IOException {
        boolean z;
        File file = this.a;
        if (!file.exists()) {
            return r66.a;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                while (fileInputStream.available() > 0) {
                    try {
                        try {
                            byte[] bArr = new byte[dataInputStream.readInt()];
                            dataInputStream.readFully(bArr);
                            arrayList.add(b(bArr));
                        } catch (IOException unused) {
                            z = true;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(dataInputStream, th);
                            throw th2;
                        }
                    }
                }
                z = false;
                dataInputStream.close();
                fileInputStream.close();
                z2 = z;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    rx8.n(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException unused2) {
        }
        if (z2) {
            DataOutputStream dataOutputStream = this.c;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            this.c = null;
            file.delete();
        }
        return arrayList;
    }
}
