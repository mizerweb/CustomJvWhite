package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class n56 {
    public static final Rect e = new Rect();
    public final Context a;
    public final String b = n56.class.getName();
    public final wme c;
    public final wme d;

    public n56(Context context) {
        this.a = context;
        final int i = 0;
        this.c = new wme(new af7(this) { // from class: m56
            public final /* synthetic */ n56 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:72:0x01fd A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            @Override // defpackage.af7
            public final Object invoke() {
                Object next;
                Object next2;
                int i2 = i;
                n56 n56Var = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = n56Var.a;
                        je9 je9Var = je9.d;
                        Drawable drawableO = wk8.o(context2, R.drawable.emoji_sprite_0);
                        Bitmap bitmap = drawableO instanceof BitmapDrawable ? ((BitmapDrawable) drawableO).getBitmap() : null;
                        int width = bitmap != null ? bitmap.getWidth() : 0;
                        int i3 = context2.getResources().getDisplayMetrics().densityDpi;
                        int iIntValue = 48;
                        Map mapQ0 = wm9.Q0(new ylc(240, 48), new ylc(320, 64), new ylc(480, 96), new ylc(640, 96));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : mapQ0.entrySet()) {
                            if (((Number) entry.getKey()).intValue() <= i3) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                int iIntValue2 = ((Number) ((Map.Entry) next).getKey()).intValue();
                                do {
                                    Object next3 = it.next();
                                    int iIntValue3 = ((Number) ((Map.Entry) next3).getKey()).intValue();
                                    if (iIntValue2 < iIntValue3) {
                                        next = next3;
                                        iIntValue2 = iIntValue3;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry2 = (Map.Entry) next;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry3 : mapQ0.entrySet()) {
                            if (((Number) entry3.getKey()).intValue() > i3) {
                                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        Iterator it2 = linkedHashMap2.entrySet().iterator();
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (it2.hasNext()) {
                                int iIntValue4 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                                do {
                                    Object next4 = it2.next();
                                    int iIntValue5 = ((Number) ((Map.Entry) next4).getKey()).intValue();
                                    if (iIntValue4 > iIntValue5) {
                                        next2 = next4;
                                        iIntValue4 = iIntValue5;
                                    }
                                } while (it2.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        Map.Entry entry4 = (Map.Entry) next2;
                        String str = n56Var.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "phoneDensity: " + i3 + "; lowerDensity: " + entry2 + "; higherDensity: " + entry4, null);
                        }
                        if (entry4 != null && ((Number) entry4.getKey()).intValue() == i3) {
                            iIntValue = ((Number) entry4.getValue()).intValue();
                        } else if ((entry2 != null ? (Integer) entry2.getKey() : null) != null && ((Number) entry2.getKey()).intValue() >= i3) {
                            iIntValue = ((Number) entry2.getValue()).intValue();
                        } else if (entry4 == null) {
                            if ((entry2 != null ? (Integer) entry2.getKey() : null) != null) {
                                iIntValue = ((Number) entry2.getValue()).intValue();
                            } else if (entry4 != null) {
                                iIntValue = ((Number) entry4.getValue()).intValue();
                            }
                        } else if (entry4 != null) {
                            iIntValue = ((Number) entry4.getValue()).intValue();
                        }
                        String str2 = n56Var.b;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, qt4.l("Emoji size by density: ", iIntValue, context2.getResources().getDisplayMetrics().densityDpi, ", density:"), null);
                        }
                        float f = width / 13.0f;
                        String str3 = n56Var.b;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                            a4cVar3.c(je9Var, str3, "Calculated emoji size in sprite: " + f + ", spriteWidth: " + width, null);
                        }
                        if (f <= 0.0f) {
                            String str4 = n56Var.b;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                a4cVar4.c(je9Var, str4, zo5.h(width, "Fallback for emoji size. Sprite width: "), null);
                            }
                            f = 48.0f;
                        }
                        String str5 = n56Var.b;
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                            a4cVar5.c(je9Var, str5, "Sprite width: " + width + "; Calculated emoji size in sprite: " + f, null);
                        }
                        return Float.valueOf(f);
                    default:
                        float fFloatValue = ((Number) n56Var.c.getValue()).floatValue();
                        return Float.valueOf((fFloatValue / 11.0f) + fFloatValue);
                }
            }
        });
        final int i2 = 1;
        this.d = new wme(new af7(this) { // from class: m56
            public final /* synthetic */ n56 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:72:0x01fd A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
            @Override // defpackage.af7
            public final Object invoke() {
                Object next;
                Object next2;
                int i3 = i2;
                n56 n56Var = this.b;
                switch (i3) {
                    case 0:
                        Context context2 = n56Var.a;
                        je9 je9Var = je9.d;
                        Drawable drawableO = wk8.o(context2, R.drawable.emoji_sprite_0);
                        Bitmap bitmap = drawableO instanceof BitmapDrawable ? ((BitmapDrawable) drawableO).getBitmap() : null;
                        int width = bitmap != null ? bitmap.getWidth() : 0;
                        int i4 = context2.getResources().getDisplayMetrics().densityDpi;
                        int iIntValue = 48;
                        Map mapQ0 = wm9.Q0(new ylc(240, 48), new ylc(320, 64), new ylc(480, 96), new ylc(640, 96));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : mapQ0.entrySet()) {
                            if (((Number) entry.getKey()).intValue() <= i4) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                int iIntValue2 = ((Number) ((Map.Entry) next).getKey()).intValue();
                                do {
                                    Object next3 = it.next();
                                    int iIntValue3 = ((Number) ((Map.Entry) next3).getKey()).intValue();
                                    if (iIntValue2 < iIntValue3) {
                                        next = next3;
                                        iIntValue2 = iIntValue3;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry2 = (Map.Entry) next;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry3 : mapQ0.entrySet()) {
                            if (((Number) entry3.getKey()).intValue() > i4) {
                                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        Iterator it2 = linkedHashMap2.entrySet().iterator();
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (it2.hasNext()) {
                                int iIntValue4 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                                do {
                                    Object next4 = it2.next();
                                    int iIntValue5 = ((Number) ((Map.Entry) next4).getKey()).intValue();
                                    if (iIntValue4 > iIntValue5) {
                                        next2 = next4;
                                        iIntValue4 = iIntValue5;
                                    }
                                } while (it2.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        Map.Entry entry4 = (Map.Entry) next2;
                        String str = n56Var.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "phoneDensity: " + i4 + "; lowerDensity: " + entry2 + "; higherDensity: " + entry4, null);
                        }
                        if (entry4 != null && ((Number) entry4.getKey()).intValue() == i4) {
                            iIntValue = ((Number) entry4.getValue()).intValue();
                        } else if ((entry2 != null ? (Integer) entry2.getKey() : null) != null && ((Number) entry2.getKey()).intValue() >= i4) {
                            iIntValue = ((Number) entry2.getValue()).intValue();
                        } else if (entry4 == null) {
                            if ((entry2 != null ? (Integer) entry2.getKey() : null) != null) {
                                iIntValue = ((Number) entry2.getValue()).intValue();
                            } else if (entry4 != null) {
                                iIntValue = ((Number) entry4.getValue()).intValue();
                            }
                        } else if (entry4 != null) {
                            iIntValue = ((Number) entry4.getValue()).intValue();
                        }
                        String str2 = n56Var.b;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, qt4.l("Emoji size by density: ", iIntValue, context2.getResources().getDisplayMetrics().densityDpi, ", density:"), null);
                        }
                        float f = width / 13.0f;
                        String str3 = n56Var.b;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                            a4cVar3.c(je9Var, str3, "Calculated emoji size in sprite: " + f + ", spriteWidth: " + width, null);
                        }
                        if (f <= 0.0f) {
                            String str4 = n56Var.b;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                a4cVar4.c(je9Var, str4, zo5.h(width, "Fallback for emoji size. Sprite width: "), null);
                            }
                            f = 48.0f;
                        }
                        String str5 = n56Var.b;
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                            a4cVar5.c(je9Var, str5, "Sprite width: " + width + "; Calculated emoji size in sprite: " + f, null);
                        }
                        return Float.valueOf(f);
                    default:
                        float fFloatValue = ((Number) n56Var.c.getValue()).floatValue();
                        return Float.valueOf((fFloatValue / 11.0f) + fFloatValue);
                }
            }
        });
    }
}
