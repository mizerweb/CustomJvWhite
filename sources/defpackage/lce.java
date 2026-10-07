package defpackage;

import android.graphics.drawable.InsetDrawable;
import com.vk.push.core.base.AidlException;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lce implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ lce(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        ifh ifhVarD;
        ifh ifhVarD2;
        int i = this.a;
        int i2 = 1;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (i) {
            case 0:
                v0k v0kVar = recordControlsWidget.b;
                kce kceVar = (kce) v0kVar.getAccessor().c(795);
                vv vvVar = recordControlsWidget.a;
                zv8 zv8Var = RecordControlsWidget.x1[0];
                t73 t73VarB = sol.b((t3f) vvVar.a(recordControlsWidget));
                fbe fbeVarH1 = recordControlsWidget.H1();
                ny8 ny8Var = recordControlsWidget.d;
                qbe qbeVar = (qbe) ny8Var.getValue();
                int iOrdinal = recordControlsWidget.H1().ordinal();
                if (iOrdinal == 0) {
                    ifhVarD = v0kVar.getAccessor().d(789);
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    ifhVarD = v0kVar.getAccessor().d(791);
                }
                ifh ifhVar = ifhVarD;
                ifh ifhVar2 = new ifh(new lce(recordControlsWidget, i2));
                ifh ifhVar3 = new ifh(new lce(recordControlsWidget, 2));
                ifh ifhVar4 = new ifh(new lce(recordControlsWidget, 3));
                gjg gjgVar = ((qbe) ny8Var.getValue()).d;
                lce lceVar = new lce(recordControlsWidget, 5);
                kceVar.getClass();
                return new jce(fbeVarH1, qbeVar, ifhVar, ifhVar2, ifhVar3, ifhVar4, lceVar, gjgVar, t73VarB, kceVar.a, kceVar.b, kceVar.c, kceVar.d, kceVar.e, kceVar.f);
            case 1:
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                fbe fbeVarH2 = recordControlsWidget.H1();
                v0k v0kVar2 = recordControlsWidget.b;
                int iOrdinal2 = fbeVarH2.ordinal();
                if (iOrdinal2 == 0) {
                    return new jzi();
                }
                if (iOrdinal2 != 1) {
                    ore.o();
                    return null;
                }
                ifh ifhVarD3 = v0kVar2.getAccessor().d(23);
                ifh ifhVarD4 = v0kVar2.getAccessor().d(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION);
                v0kVar2.getAccessor().getClass();
                return new g90(ifhVarD3, ifhVarD4, v0kVar2.getAccessor().d(138));
            case 2:
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                fbe fbeVarH3 = recordControlsWidget.H1();
                v0k v0kVar3 = recordControlsWidget.b;
                int iOrdinal3 = fbeVarH3.ordinal();
                if (iOrdinal3 == 0) {
                    ifhVarD2 = v0kVar3.getAccessor().d(789);
                } else {
                    if (iOrdinal3 != 1) {
                        ore.o();
                        return null;
                    }
                    ifhVarD2 = v0kVar3.getAccessor().d(791);
                }
                return new vc0(ifhVarD2, v0kVar3.getAccessor().d(23), v0kVar3.getAccessor().d(48));
            case 3:
                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                return recordControlsWidget.H1() == fbe.a ? new nxi(recordControlsWidget.b.getAccessor().d(241), ((qbe) recordControlsWidget.d.getValue()).c) : new r90();
            case 4:
                return recordControlsWidget.getContext().getDrawable(recordControlsWidget.w.a);
            case 5:
                return Boolean.valueOf(((f62) ((n42) ((k42) recordControlsWidget.b.getAccessor().c(66))).f.a.getValue()).b);
            case 6:
                zv8[] zv8VarArr4 = RecordControlsWidget.x1;
                vv vvVar2 = recordControlsWidget.a;
                zv8 zv8Var2 = RecordControlsWidget.x1[0];
                return recordControlsWidget.getContext().getDrawable(sol.e((t3f) vvVar2.a(recordControlsWidget)) ? R.drawable.icon_clock : R.drawable.icon_arrow_up);
            case 7:
                zv8[] zv8VarArr5 = RecordControlsWidget.x1;
                return new InsetDrawable(recordControlsWidget.getContext().getDrawable(R.drawable.icon_chevron_left_mini), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
            default:
                zv8[] zv8VarArr6 = RecordControlsWidget.x1;
                return new x96(recordControlsWidget.getContext());
        }
    }
}
