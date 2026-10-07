package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m4m {
    public static HashMap a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map map) {
        boolean z2 = false;
        qyj.h("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((yi0) entry.getValue()).a.getWidth(), ((yi0) entry.getValue()).a.getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((cli) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalB = f3m.b(i, rational);
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalB.getNumerator(), rationalB.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    ore.k(zo5.h(i2, "Unexpected scale type: "));
                    return null;
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF2.centerX();
                    float f = fCenterX + fCenterX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF2.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f4 - rectF7.right, rectF7.top, f4 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((cli) entry2.getKey(), rect2);
        }
        return map3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00d3  */
    public static final void b(String str, long j, rt2 rt2Var, long j2) {
        String strK;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbB = nbh.B(j, "[", str, "] chatId=");
            sbB.append(" ");
            sb.append(sbB.toString());
            if (rt2Var == null) {
                sb.append("chat=NULL");
            } else {
                sb.append("isChannel=" + rt2Var.d0() + " ");
                sb.append("isPublic=" + rt2Var.x0() + " ");
                sb.append("isPrivate=" + rt2Var.w0() + " ");
                sb.append("accessType=" + tt2.j(rt2Var.b.w0) + " ");
                sb.append("hasLink=" + rt2Var.b.c() + " ");
                Object obj = rt2Var.b.J;
                if (obj == null) {
                    strK = null;
                } else if (gm0.c()) {
                    strK = obj.toString();
                } else if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    if (collection.isEmpty()) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(collection.size(), "[**", "**]");
                    }
                } else if (obj instanceof Map) {
                    Map map = (Map) obj;
                    strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                } else if (obj instanceof Object[]) {
                    Object[] objArr = (Object[]) obj;
                    if (objArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(objArr.length, "[**", "**]");
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(iArr.length, "[**", "**]");
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    if (fArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(fArr.length, "[**", "**]");
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(jArr.length, "[**", "**]");
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    if (dArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(dArr.length, "[**", "**]");
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    if (sArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(sArr.length, "[**", "**]");
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(bArr.length, "[**", "**]");
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    if (cArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(cArr.length, "[**", "**]");
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(zArr.length, "[**", "**]");
                    }
                } else {
                    strK = "***";
                }
                sb.append("link=" + strK + " ");
                sb.append("isActive=" + rt2Var.W() + " ");
                sb.append("isSelfParticipant=" + rt2Var.C0() + " ");
                sb.append("isSelfAdmin=" + rt2Var.z0() + " ");
                sb.append("isSelfOwner=" + rt2Var.B0() + " ");
                sb.append("hasAddMember=" + rt2Var.I() + " ");
                sb.append("hasSeePrivateLink=" + rt2Var.S() + " ");
                sb.append("hasEditLink=" + srk.a(rt2Var.n(j2), np0.m) + " ");
                sb.append("chatOptions=" + (rt2Var.b.I != null) + " ");
                zw2 zw2Var = rt2Var.b.I;
                sb.append("onlyAdminCanAddMember=" + (zw2Var != null ? Boolean.valueOf(zw2Var.d) : null) + " ");
                zw2 zw2Var2 = rt2Var.b.I;
                sb.append("membersCanSeePrivateLink=" + (zw2Var2 != null ? Boolean.valueOf(zw2Var2.i) : null) + " ");
                sb.append("serverId=" + rt2Var.A());
            }
            a4cVar.c(je9Var, "ProfileInviteFlow", sb.toString(), null);
        }
    }
}
