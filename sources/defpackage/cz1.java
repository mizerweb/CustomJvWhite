package defpackage;

import android.database.SQLException;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cz1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cz1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                w82 w82Var = ((h02) obj).e;
                w82Var.getClass();
                int i2 = z ? 1 : 2;
                CameraManager cameraManagerA = w82Var.c.a();
                if (cameraManagerA != null) {
                    cameraManagerA.switchCamera(new eg2(i2));
                }
                return sbiVar;
            case 1:
                a42.u((a42) obj, z);
                return sbiVar;
            default:
                ie4 ie4Var = (ie4) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                ie4Var.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                ie4Var.a.d(sb);
                try {
                    n1g.a0(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i3 = ie4Var.g;
                    if (i3 == 1) {
                        throw e;
                    }
                    if (i3 == 2) {
                        e.printStackTrace();
                    }
                    return sbiVar;
                }
        }
    }
}
