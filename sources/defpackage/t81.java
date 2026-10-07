package defpackage;

import java.time.Instant;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t81 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ t81(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((z5k) obj).c = 3;
                break;
            case 2:
                ((z5k) obj).c = 2;
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                break;
            case 5:
                ((fak) obj).d(true);
                break;
            case 6:
                break;
            case 7:
                pak pakVar = (pak) obj;
                pakVar.f.l();
                pakVar.e.y();
                break;
            case 8:
                zbk zbkVar = (zbk) obj;
                zbkVar.c.accept(zbkVar.b);
                Instant.now();
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                ((hek) obj).a(386759528L);
                break;
            case 12:
                ((hek) obj).b(386759528L);
                break;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                final bek[] bekVarArr = cek.a;
                String strSubstring = (String) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                while (strSubstring.length() > 8) {
                    int i = Integer.parseInt(strSubstring.substring(0, 8), 2);
                    strSubstring = strSubstring.substring(8);
                    if (bekVarArr[i] == null) {
                        bekVarArr[i] = new bek();
                    }
                    bekVarArr = bekVarArr[i].c;
                }
                int i2 = Integer.parseInt(strSubstring.substring(0, strSubstring.length()), 2);
                final bek bekVar = new bek(iIntValue, strSubstring.length());
                int length = 8 - strSubstring.length();
                IntStream.range(0, (int) Math.pow(2.0d, length)).map(new ehc(i2 << length, 1)).forEach(new IntConsumer() { // from class: aek
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i3) {
                        bekVarArr[i3] = bekVar;
                    }
                });
                break;
            case 14:
                ((hek) obj).getClass();
                break;
            case 15:
                ((hek) obj).getClass();
                break;
            default:
                break;
        }
    }

    public /* synthetic */ t81(int i, Object obj) {
        this.a = i;
    }
}
