package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ho0 {
    public final go0 a;
    public final go0 b = new go0();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public ho0(Context context) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        go0 go0Var = new go0();
        int i = go0Var.a;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayB = ch3.B(context, attributeSetAsAttributeSet, k3e.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayB.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayB.getDimensionPixelSize(14, -1);
        this.e = typedArrayB.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayB.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayB.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayB.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayB.getInt(24, 1);
        go0 go0Var2 = this.b;
        int i2 = go0Var.i;
        go0Var2.i = i2 == -2 ? 255 : i2;
        int i3 = go0Var.k;
        if (i3 != -2) {
            go0Var2.k = i3;
        } else {
            boolean zHasValue = typedArrayB.hasValue(23);
            go0 go0Var3 = this.b;
            if (zHasValue) {
                go0Var3.k = typedArrayB.getInt(23, 0);
            } else {
                go0Var3.k = -1;
            }
        }
        String str = go0Var.j;
        if (str != null) {
            this.b.j = str;
        } else if (typedArrayB.hasValue(7)) {
            this.b.j = typedArrayB.getString(7);
        }
        go0 go0Var4 = this.b;
        go0Var4.o = go0Var.o;
        CharSequence charSequence = go0Var.p;
        go0Var4.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        go0 go0Var5 = this.b;
        int i4 = go0Var.q;
        go0Var5.q = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = go0Var.r;
        go0Var5.r = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = go0Var.t;
        go0Var5.t = Boolean.valueOf(bool == null || bool.booleanValue());
        go0 go0Var6 = this.b;
        int i6 = go0Var.l;
        go0Var6.l = i6 == -2 ? typedArrayB.getInt(21, -2) : i6;
        go0 go0Var7 = this.b;
        int i7 = go0Var.m;
        go0Var7.m = i7 == -2 ? typedArrayB.getInt(22, -2) : i7;
        go0 go0Var8 = this.b;
        Integer num = go0Var.e;
        go0Var8.e = Integer.valueOf(num == null ? typedArrayB.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        go0 go0Var9 = this.b;
        Integer num2 = go0Var.f;
        go0Var9.f = Integer.valueOf(num2 == null ? typedArrayB.getResourceId(6, 0) : num2.intValue());
        go0 go0Var10 = this.b;
        Integer num3 = go0Var.g;
        go0Var10.g = Integer.valueOf(num3 == null ? typedArrayB.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        go0 go0Var11 = this.b;
        Integer num4 = go0Var.h;
        go0Var11.h = Integer.valueOf(num4 == null ? typedArrayB.getResourceId(16, 0) : num4.intValue());
        go0 go0Var12 = this.b;
        Integer num5 = go0Var.b;
        go0Var12.b = Integer.valueOf(num5 == null ? cqk.r(context, typedArrayB, 1).getDefaultColor() : num5.intValue());
        go0 go0Var13 = this.b;
        Integer num6 = go0Var.d;
        go0Var13.d = Integer.valueOf(num6 == null ? typedArrayB.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = go0Var.c;
        if (num7 != null) {
            this.b.c = num7;
        } else {
            boolean zHasValue2 = typedArrayB.hasValue(9);
            go0 go0Var14 = this.b;
            if (zHasValue2) {
                go0Var14.c = Integer.valueOf(cqk.r(context, typedArrayB, 9).getDefaultColor());
            } else {
                this.b.c = Integer.valueOf(new zlh(context, go0Var14.d.intValue()).j.getDefaultColor());
            }
        }
        go0 go0Var15 = this.b;
        Integer num8 = go0Var.s;
        go0Var15.s = Integer.valueOf(num8 == null ? typedArrayB.getInt(2, 8388661) : num8.intValue());
        go0 go0Var16 = this.b;
        Integer num9 = go0Var.u;
        go0Var16.u = Integer.valueOf(num9 == null ? typedArrayB.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        go0 go0Var17 = this.b;
        Integer num10 = go0Var.v;
        go0Var17.v = Integer.valueOf(num10 == null ? typedArrayB.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        go0 go0Var18 = this.b;
        Integer num11 = go0Var.w;
        go0Var18.w = Integer.valueOf(num11 == null ? typedArrayB.getDimensionPixelOffset(18, 0) : num11.intValue());
        go0 go0Var19 = this.b;
        Integer num12 = go0Var.x;
        go0Var19.x = Integer.valueOf(num12 == null ? typedArrayB.getDimensionPixelOffset(25, 0) : num12.intValue());
        go0 go0Var20 = this.b;
        Integer num13 = go0Var.y;
        go0Var20.y = Integer.valueOf(num13 == null ? typedArrayB.getDimensionPixelOffset(19, go0Var20.w.intValue()) : num13.intValue());
        go0 go0Var21 = this.b;
        Integer num14 = go0Var.z;
        go0Var21.z = Integer.valueOf(num14 == null ? typedArrayB.getDimensionPixelOffset(26, go0Var21.x.intValue()) : num14.intValue());
        go0 go0Var22 = this.b;
        Integer num15 = go0Var.C;
        go0Var22.C = Integer.valueOf(num15 == null ? typedArrayB.getDimensionPixelOffset(20, 0) : num15.intValue());
        go0 go0Var23 = this.b;
        Integer num16 = go0Var.A;
        go0Var23.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        go0 go0Var24 = this.b;
        Integer num17 = go0Var.B;
        go0Var24.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        go0 go0Var25 = this.b;
        Boolean bool2 = go0Var.D;
        go0Var25.D = Boolean.valueOf(bool2 == null ? typedArrayB.getBoolean(0, false) : bool2.booleanValue());
        typedArrayB.recycle();
        Locale locale = go0Var.n;
        go0 go0Var26 = this.b;
        if (locale == null) {
            go0Var26.n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            go0Var26.n = locale;
        }
        this.a = go0Var;
    }
}
