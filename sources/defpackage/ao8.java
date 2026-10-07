package defpackage;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.function.ToIntFunction;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ao8 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ ao8(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) obj).getBytes(Charset.forName("UTF-8")).length;
            case 1:
                return ((X500Principal) obj).getEncoded().length;
            case 2:
                return ((ox8) obj).a.length + 6;
            case 3:
                return ((nx8) obj).a.length + 1;
            case 4:
                return ((Integer) zkc.c.get((kfk) obj)).intValue();
            case 5:
                return ((byte[]) obj).length;
            case 6:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue();
            case 7:
                return ((gab) obj).b().length;
            case 8:
                return ((byte[]) obj).length;
            case 9:
                return ((pbk) obj).q();
            case 10:
                return ((pbk) obj).q();
            case 11:
                return ((pbk) obj).q();
            case 12:
                return ((pbk) obj).c.stream().filter(new e05(28)).mapToInt(new ao8(13)).sum();
            case 13:
                return ((t8k) ((o8k) obj)).d;
            case 14:
                return ((o8k) obj).a();
            case 15:
                return ((o8k) obj).a();
            case 16:
                return ((o8k) obj).a();
            default:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getValue()).length() + ((String) entry.getKey()).length();
        }
    }
}
