package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class ys7 extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys7(int i, Object obj) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010c A[LOOP:0: B:21:0x0085->B:42:0x010c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0110 A[SYNTHETIC] */
    @Override // defpackage.af7
    public final Object invoke() {
        Map linkedHashMap;
        Object utf;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (List) obj;
            case 1:
                try {
                    return (List) ((af7) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return r66.a;
                }
            case 2:
                return yab.O((i8j) obj);
            case 3:
                Context context = ((snf) obj).a;
                String strP = ch3.p();
                File file = new File(context.getCacheDir(), strP.equals(context.getPackageName()) ? "tracer" : "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false))));
                sb8.U(file);
                return lu6.q0(file, "session.data");
            case 4:
                fbc fbcVar = (fbc) obj;
                Map map = s66.a;
                try {
                    File file2 = (File) ((af7) fbcVar.b).invoke();
                    if (file2.exists()) {
                        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file2)));
                        try {
                            if (dataInputStream.readInt() > 1) {
                                linkedHashMap = map;
                            } else {
                                int i2 = dataInputStream.readInt();
                                linkedHashMap = new LinkedHashMap();
                                if (1 <= i2) {
                                    int i3 = 1;
                                    while (true) {
                                        String utf2 = dataInputStream.readUTF();
                                        int i4 = dataInputStream.readInt();
                                        switch (i4) {
                                            case 1:
                                                utf = dataInputStream.readUTF();
                                                linkedHashMap.put(utf2, utf);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                                break;
                                            case 2:
                                                utf = Boolean.valueOf(dataInputStream.readBoolean());
                                                linkedHashMap.put(utf2, utf);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                                break;
                                            case 3:
                                                utf = Integer.valueOf(dataInputStream.readInt());
                                                linkedHashMap.put(utf2, utf);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                                break;
                                            case 4:
                                                utf = Long.valueOf(dataInputStream.readLong());
                                                linkedHashMap.put(utf2, utf);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                                break;
                                            case 5:
                                                utf = Float.valueOf(dataInputStream.readFloat());
                                                linkedHashMap.put(utf2, utf);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                                break;
                                            case 6:
                                                utf = Double.valueOf(dataInputStream.readDouble());
                                                linkedHashMap.put(utf2, utf);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                                break;
                                            case 7:
                                                int i5 = dataInputStream.readInt();
                                                int i6 = dataInputStream.readInt();
                                                for (int i7 = 0; i7 < i6; i7++) {
                                                    dataInputStream.readUTF();
                                                    dataInputStream.readLong();
                                                    dataInputStream.readUTF();
                                                    dataInputStream.readUTF();
                                                    dataInputStream.readLong();
                                                    if (i5 == 1) {
                                                        dataInputStream.readInt();
                                                    }
                                                }
                                                utf = sbi.a;
                                                linkedHashMap.put(utf2, utf);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Read unknown type " + i4 + " with key " + utf2);
                                        }
                                    }
                                }
                            }
                            dataInputStream.close();
                            map = linkedHashMap;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                rx8.n(dataInputStream, th);
                                throw th2;
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                return new AtomicReference(map);
            default:
                Context context2 = (Context) obj;
                String strP2 = ch3.p();
                File file3 = new File(context2.getCacheDir(), strP2.equals(context2.getPackageName()) ? "tracer" : "tracer-" + ((Object) Uri.encode(z5h.I0(strP2, ':', '-', false))));
                sb8.U(file3);
                return lu6.q0(file3, "settings.data");
        }
    }
}
