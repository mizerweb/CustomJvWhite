package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jdk {
    public static final ifh d = new ifh(new t4i(3));
    public final File a;
    public final File b;
    public final Object c = new Object();

    public jdk(File file) {
        this.a = new File(file, wk8.b("1d69161b7f661a427879077b7271477f7278"));
        this.b = new File(file, wk8.b("dc68f8fb9f881b839f9706a8a48a0dac948a1cf2999106"));
    }

    public static s9k a(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            int i = dataInputStream.readInt();
            int i2 = dataInputStream.readInt();
            int i3 = dataInputStream.readInt();
            long j = dataInputStream.readLong();
            float f = dataInputStream.readFloat();
            ArrayList arrayList = new ArrayList();
            int i4 = dataInputStream.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(dataInputStream.readUTF());
            }
            ArrayList arrayList2 = new ArrayList();
            int i6 = dataInputStream.readInt();
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList2.add(dataInputStream.readUTF());
            }
            ArrayList arrayList3 = new ArrayList();
            int i8 = dataInputStream.readInt();
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList3.add(new yik(dataInputStream.readInt(), dataInputStream.readUTF()));
            }
            s9k s9kVar = new s9k(arrayList, arrayList2, arrayList3, i2, i, i3, j, f);
            dataInputStream.close();
            return s9kVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(dataInputStream, th);
                throw th2;
            }
        }
    }

    public static byte[] c(s9k s9kVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            int i = s9kVar.e;
            List<yik> list = s9kVar.c;
            List list2 = s9kVar.b;
            List list3 = s9kVar.a;
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(s9kVar.d);
            dataOutputStream.writeInt(s9kVar.f);
            dataOutputStream.writeLong(s9kVar.g);
            dataOutputStream.writeFloat(s9kVar.h);
            dataOutputStream.writeInt(list3.size());
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                dataOutputStream.writeUTF((String) it.next());
            }
            dataOutputStream.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                dataOutputStream.writeUTF((String) it2.next());
            }
            dataOutputStream.writeInt(list.size());
            for (yik yikVar : list) {
                dataOutputStream.writeInt(yikVar.a);
                dataOutputStream.writeUTF(yikVar.b);
            }
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(dataOutputStream, th);
                throw th2;
            }
        }
    }

    public final s9k b() {
        s9k s9kVarA;
        synchronized (this.c) {
            if (this.a.exists()) {
                try {
                    s9kVarA = a(lu6.n0(this.a));
                } catch (Exception unused) {
                    s9kVarA = (s9k) d.getValue();
                }
            } else {
                s9kVarA = (s9k) d.getValue();
            }
        }
        return s9kVarA;
    }

    public final long d() {
        long j;
        synchronized (this.c) {
            if (this.b.exists()) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new FileInputStream(this.b));
                    try {
                        j = dataInputStream.readLong();
                        dataInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(dataInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    j = 0;
                }
            } else {
                j = 0;
            }
        }
        return j;
    }
}
