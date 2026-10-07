package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Looper;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.regex.Pattern;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.folders.list.FoldersListScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h57 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ h57(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbh sbhVar = sbh.a;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = FoldersListScreen.h;
                return y3f.SETTINGS_FOLDERS;
            case 1:
                zv8[] zv8VarArr2 = ForwardPickerScreen.z;
                return y3f.CHAT_FORWARD;
            case 2:
                zv8[] zv8VarArr3 = ForwardPickerScreen.z;
                return sbi.a;
            case 3:
                return FrameDecorator.Companion.EMPTY_delegate$lambda$0();
            case 4:
                return Looper.getMainLooper().getThread();
            case 5:
                Paint paint = new Paint();
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return paint;
            case 6:
                Paint paint2 = new Paint();
                paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{10.0f, 0.0f, 0.0f, 0.0f, -1152.0f, 0.0f, 10.0f, 0.0f, 0.0f, -1152.0f, 0.0f, 0.0f, 10.0f, 0.0f, -1152.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
                return paint2;
            case 7:
                Paint paint3 = new Paint();
                paint3.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
                return paint3;
            case 8:
                ifh ifhVar = lr7.a;
                ArrayList arrayList = new ArrayList();
                qbh qbhVar = new qbh();
                t4h t4hVar = tbh.e;
                rbh rbhVar = rbh.S1080P_16_9;
                qbh qbhVarD = x05.d(sbhVar, rbhVar, qbhVar, arrayList, qbhVar);
                rbh rbhVar2 = rbh.S720P_16_9;
                qbhVarD.a(yr8.m(sbhVar, rbhVar2));
                arrayList.add(qbhVarD);
                rbh rbhVar3 = rbh.MAXIMUM_16_9;
                arrayList.addAll(lr7.a(rbhVar, rbhVar3));
                rbh rbhVar4 = rbh.UHD;
                arrayList.addAll(lr7.a(rbhVar, rbhVar4));
                arrayList.addAll(lr7.a(rbhVar, rbh.S1440P_16_9));
                arrayList.addAll(lr7.a(rbhVar, rbhVar));
                arrayList.addAll(lr7.a(rbhVar2, rbhVar3));
                arrayList.addAll(lr7.a(rbhVar2, rbhVar4));
                arrayList.addAll(lr7.a(rbhVar2, rbhVar));
                rbh rbhVar5 = rbh.X_VGA;
                rbh rbhVar6 = rbh.MAXIMUM_4_3;
                arrayList.addAll(lr7.a(rbhVar5, rbhVar6));
                arrayList.addAll(lr7.a(rbh.S1080P_4_3, rbhVar6));
                return arrayList;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                qbh qbhVar2 = new qbh();
                t4h t4hVar2 = tbh.e;
                rbh rbhVar7 = rbh.S1080P_16_9;
                x05.k(sbhVar, rbhVar7, qbhVar2, sbhVar, rbhVar7);
                qbh qbhVarE = x05.e(arrayList2, qbhVar2);
                qbhVarE.a(yr8.m(sbhVar, rbhVar7));
                qbh qbhVarD2 = x05.d(sbhVar, rbh.S1440P_16_9, qbhVarE, arrayList2, qbhVarE);
                qbhVarD2.a(yr8.m(sbhVar, rbhVar7));
                qbh qbhVarD3 = x05.d(sbhVar, rbh.UHD, qbhVarD2, arrayList2, qbhVarD2);
                qbhVarD3.a(yr8.m(sbhVar, rbhVar7));
                x05.k(sbh.b, rbhVar7, qbhVarD3, sbhVar, rbhVar7);
                arrayList2.add(qbhVarD3);
                return arrayList2;
            case 10:
                Paint paint4 = new Paint();
                paint4.setStyle(Paint.Style.FILL);
                return paint4;
            case 11:
                return new TextPaint();
            case 12:
                return new wd1(bj8.a(gm0.K(32.0f * yl5.d().getDisplayMetrics().density), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)), bj8.a(gm0.K(72.0f * yl5.d().getDisplayMetrics().density), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)), vd1.RIGHT);
            case 13:
                return new wd1(bj8.a(gm0.K(32.0f * yl5.d().getDisplayMetrics().density), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)), bj8.a(gm0.K(72.0f * yl5.d().getDisplayMetrics().density), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)), vd1.LEFT);
            case 14:
                return q1m.a(uz7.a);
            case 15:
                return q1m.a(uz7.j);
            case 16:
                return q1m.a(uz7.k);
            case 17:
                return q1m.a(uz7.l);
            case 18:
                return q1m.a(uz7.m);
            case 19:
                return q1m.a(uz7.n);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return q1m.a(uz7.p);
            case 21:
                return q1m.a(uz7.r);
            case 22:
                return q1m.a(uz7.t);
            case 23:
                return q1m.a(uz7.v);
            case 24:
                return q1m.a(uz7.x);
            case 25:
                return q1m.a(uz7.c);
            case 26:
                return q1m.a(uz7.e);
            case 27:
                return q1m.a(uz7.g);
            case 28:
                return q1m.a(uz7.i);
            default:
                return Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        }
    }
}
