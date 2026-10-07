package defpackage;

import android.content.Context;
import one.me.qrscanner.QrScannerWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0e implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrScannerWidget b;

    public /* synthetic */ p0e(QrScannerWidget qrScannerWidget, int i) {
        this.a = i;
        this.b = qrScannerWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        QrScannerWidget qrScannerWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = QrScannerWidget.w;
                int iOrdinal = qrScannerWidget.q1().ordinal();
                if (iOrdinal == 0) {
                    return y3f.MINIAPP_QR_SCANNER;
                }
                if (iOrdinal == 1) {
                    return y3f.SETTINGS_DEVICES_QR_SCANER;
                }
                ore.o();
                return null;
            case 1:
                vv vvVar = qrScannerWidget.b;
                zv8[] zv8VarArr2 = QrScannerWidget.w;
                int iOrdinal2 = qrScannerWidget.q1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return lmc.h;
                    }
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr3 = QrScannerWidget.w;
                zv8 zv8Var = zv8VarArr3[1];
                if (((Long) vvVar.a(qrScannerWidget)) == null) {
                    return lmc.h;
                }
                zv8 zv8Var2 = zv8VarArr3[1];
                return new lmc(null, 0, rdg.WEBAPP_ID, (Long) vvVar.a(qrScannerWidget), null, null, 115);
            case 2:
                zv8[] zv8VarArr4 = QrScannerWidget.w;
                wtc wtcVar = qrScannerWidget.d;
                return new o0e(new vo7((Context) wtcVar.getAccessor().c(7), ((a2c) wtcVar.getAccessor().c(27)).c()), (xhh) wtcVar.getAccessor().c(23));
            case 3:
                return ((a2c) qrScannerWidget.d.getAccessor().c(27)).c();
            case 4:
                zv8[] zv8VarArr5 = QrScannerWidget.w;
                return qrScannerWidget.getContext().getDrawable(R.drawable.icon_flash_fill);
            case 5:
                zv8[] zv8VarArr6 = QrScannerWidget.w;
                return qrScannerWidget.getContext().getDrawable(R.drawable.icon_flash_crossed_fill);
            default:
                return (wsc) qrScannerWidget.d.getAccessor().c(34);
        }
    }
}
