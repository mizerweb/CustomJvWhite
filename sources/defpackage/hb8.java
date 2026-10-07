package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hb8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ hb8(xkh xkhVar, int i) {
        this.a = 7;
        this.b = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int iIndexOf;
        int i4 = this.a;
        boolean zAddLinks = false;
        zAddLinks = false;
        sbi sbiVar = sbi.a;
        int i5 = this.b;
        switch (i4) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException)) {
                    pb9 pb9Var = new pb9(c0a.k(i5, "prefetch ", " fetchVirtualAlbums() completed by error"), th);
                    gm0.V(rb8.u, pb9Var.getMessage(), pb9Var);
                }
                return sbiVar;
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 != null && !(th2 instanceof CancellationException)) {
                    pb9 pb9Var2 = new pb9(c0a.k(i5, "prefetch ", " fetchRealAlbums() completed by error"), th2);
                    gm0.V(rb8.u, pb9Var2.getMessage(), pb9Var2);
                }
                return sbiVar;
            case 2:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM call_history WHERE history_id NOT IN (SELECT history_id FROM call_history ORDER BY time DESC LIMIT ?)");
                try {
                    vxeVarO0.c(1, i5);
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 3:
                wue.z((wue) obj, i5);
                return sbiVar;
            case 4:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(nbh.t("Collection doesn't contain element at index ", i5, '.'));
            case 5:
                Context context = (Context) obj;
                int iD = qt4.D(i5);
                if (iD == 0) {
                    return new j24(context);
                }
                if (iD == 1) {
                    return new q44(context);
                }
                ore.o();
                return null;
            case 6:
                Spannable spannable = (Spannable) obj;
                if (Build.VERSION.SDK_INT >= 28) {
                    zAddLinks = Linkify.addLinks(spannable, i5);
                } else if (i5 != 0) {
                    Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
                    for (int length = objArr.length - 1; length >= 0; length--) {
                        spannable.removeSpan(objArr[length]);
                    }
                    if ((i5 & 4) != 0) {
                        Linkify.addLinks(spannable, 4);
                    }
                    ArrayList<i69> arrayList = new ArrayList();
                    if ((i5 & 1) != 0) {
                        mmc.b(arrayList, spannable, soc.b, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
                    }
                    if ((i5 & 2) != 0) {
                        mmc.b(arrayList, spannable, soc.c, new String[]{"mailto:"}, null);
                    }
                    if ((i5 & 8) != 0) {
                        String string = spannable.toString();
                        int i6 = 0;
                        while (true) {
                            try {
                                String strA = mmc.a(string);
                                if (strA != null && (iIndexOf = string.indexOf(strA)) >= 0) {
                                    i69 i69Var = new i69();
                                    int length2 = strA.length() + iIndexOf;
                                    i69Var.c = iIndexOf + i6;
                                    i6 += length2;
                                    i69Var.d = i6;
                                    string = string.substring(length2);
                                    try {
                                        i69Var.b = "geo:0,0?q=" + URLEncoder.encode(strA, "UTF-8");
                                        arrayList.add(i69Var);
                                    } catch (UnsupportedEncodingException unused) {
                                    }
                                }
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                    }
                    for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                        i69 i69Var2 = new i69();
                        i69Var2.a = uRLSpan;
                        i69Var2.c = spannable.getSpanStart(uRLSpan);
                        i69Var2.d = spannable.getSpanEnd(uRLSpan);
                        arrayList.add(i69Var2);
                    }
                    Collections.sort(arrayList, mmc.a);
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size - 1) {
                        i69 i69Var3 = (i69) arrayList.get(i7);
                        int i8 = i7 + 1;
                        i69 i69Var4 = (i69) arrayList.get(i8);
                        int i9 = i69Var3.c;
                        int i10 = i69Var4.c;
                        if (i9 <= i10 && (i = i69Var3.d) > i10) {
                            int i11 = i69Var4.d;
                            int i12 = (i11 > i && (i2 = i - i9) <= (i3 = i11 - i10)) ? i2 < i3 ? i7 : -1 : i8;
                            if (i12 != -1) {
                                Object obj2 = ((i69) arrayList.get(i12)).a;
                                if (obj2 != null) {
                                    spannable.removeSpan(obj2);
                                }
                                arrayList.remove(i12);
                                size--;
                            }
                        }
                        i7 = i8;
                    }
                    if (arrayList.size() != 0) {
                        for (i69 i69Var5 : arrayList) {
                            if (i69Var5.a == null) {
                                spannable.setSpan(new URLSpan(i69Var5.b), i69Var5.c, i69Var5.d, 33);
                            }
                        }
                        zAddLinks = true;
                    }
                }
                return Boolean.valueOf(zAddLinks);
            case 7:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT id FROM tasks WHERE status = ? OR status = ? LIMIT ?");
                try {
                    vxeVarO1.c(1, 0L);
                    vxeVarO1.c(2, 20L);
                    vxeVarO1.c(3, i5);
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList2.add(Long.valueOf(vxeVarO1.getLong(0)));
                    }
                    vxeVarO1.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    vxeVarO1.close();
                    throw th3;
                }
            default:
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) obj;
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i5 != 0 ? gm0.K(12.0f * yl5.d().getDisplayMetrics().density) : 0, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                return sbiVar;
        }
    }

    public /* synthetic */ hb8(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
