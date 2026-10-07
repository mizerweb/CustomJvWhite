package defpackage;

import one.me.complaintbottomsheet.ComplaintBottomSheet;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r54 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComplaintBottomSheet b;

    public /* synthetic */ r54(ComplaintBottomSheet complaintBottomSheet, int i) {
        this.a = i;
        this.b = complaintBottomSheet;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        b64 b64Var = b64.h;
        int i2 = 2;
        ComplaintBottomSheet complaintBottomSheet = this.b;
        switch (i) {
            case 0:
                vv vvVar = complaintBottomSheet.d;
                zv8 zv8Var = ComplaintBottomSheet.n[3];
                String str = (String) vvVar.a(complaintBottomSheet);
                b64 b64Var2 = b64.e;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1852504073:
                            if (str.equals("sus_p2g")) {
                                return b64.g;
                            }
                            break;
                        case 109285:
                            str.equals("p2g");
                            break;
                        case 109294:
                            if (str.equals("p2p")) {
                                return b64.f;
                            }
                            break;
                        case 109770997:
                            if (str.equals("story")) {
                                return b64Var;
                            }
                            break;
                    }
                }
                return b64Var2;
            case 1:
                h hVar = complaintBottomSheet.h;
                g64 g64Var = (g64) hVar.getAccessor().c(HttpStatus.SC_MOVED_TEMPORARILY);
                vv vvVar2 = complaintBottomSheet.b;
                zv8[] zv8VarArr = ComplaintBottomSheet.n;
                zv8 zv8Var2 = zv8VarArr[1];
                Long l = (Long) vvVar2.a(complaintBottomSheet);
                vv vvVar3 = complaintBottomSheet.c;
                zv8 zv8Var3 = zv8VarArr[2];
                Long l2 = (Long) vvVar3.a(complaintBottomSheet);
                vv vvVar4 = complaintBottomSheet.a;
                zv8 zv8Var4 = zv8VarArr[0];
                long[] jArr = (long[]) vvVar4.a(complaintBottomSheet);
                boolean z = complaintBottomSheet.o1() == b64Var;
                zv8 zv8Var5 = zv8VarArr[2];
                return new f64(jArr, l, l2, z, ((Long) vvVar3.a(complaintBottomSheet)) == null ? hVar.getAccessor().d(136) : hVar.getAccessor().d(228), g64Var.a, g64Var.b, g64Var.c, g64Var.d, g64Var.e);
            case 2:
                zv8[] zv8VarArr2 = ComplaintBottomSheet.n;
                return new kc4(R.id.oneme_complaint_action_cancel, complaintBottomSheet.o1().c, i2, 56);
            default:
                zv8[] zv8VarArr3 = ComplaintBottomSheet.n;
                h8c h8cVar = new h8c(complaintBottomSheet);
                h8cVar.h(complaintBottomSheet.o1().d);
                h8cVar.m(new tnh(R.string.oneme_chat_complaint_success_snackbar_title));
                h8cVar.l(g9c.b);
                return h8cVar;
        }
    }
}
