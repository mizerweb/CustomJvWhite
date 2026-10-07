package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class izl {
    public final /* synthetic */ int a = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [c98, java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean d(j36 j36Var, boolean z) {
        ?? r0 = z;
        while (true) {
            ?? r1 = j36Var.a;
            c98 c98Var = j36Var.b;
            if (r0 >= r1.size()) {
                for (int i = 0; i < c98Var.size(); i++) {
                    if ((((i36) c98Var.get(i)) instanceof fth) && (!z || i > 0)) {
                        return true;
                    }
                }
                return false;
            }
            if ((r1.get(r0) instanceof reg) || ((fb0) r1.get(r0)).i(1000000000L) != 1000000000) {
                return true;
            }
            r0++;
        }
    }

    public static String i(Context context, ry9 ry9Var) {
        jy9 jy9Var = ry9Var.b;
        if (jy9Var == null) {
            return null;
        }
        String str = jy9Var.b;
        Uri uri = jy9Var.a;
        if (str == null) {
            if (Objects.equals(uri.getScheme(), "content")) {
                return context.getContentResolver().getType(uri);
            }
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            int iLastIndexOf = path.lastIndexOf(".");
            if (iLastIndexOf >= 0) {
                if (iLastIndexOf < path.length() - 1) {
                    String strB0 = n1g.b0(path.substring(iLastIndexOf + 1));
                    strB0.getClass();
                    switch (strB0) {
                        case "arw":
                        case "cr2":
                        case "k25":
                        case "raw":
                            return "image/raw";
                        case "bmp":
                        case "dib":
                            return "image/bmp";
                        case "gif":
                            return "image/gif";
                        case "ico":
                            return "image/x-icon";
                        case "jfi":
                        case "jif":
                        case "jpe":
                        case "jpg":
                        case "jfif":
                        case "jpeg":
                            return "image/jpeg";
                        case "png":
                            return "image/png";
                        case "svg":
                        case "svgz":
                            return "image/svg+xml";
                        case "tif":
                        case "tiff":
                            return "image/tiff";
                        case "avif":
                            return "image/avif";
                        case "heic":
                            return "image/heic";
                        case "heif":
                            return "image/heif";
                        case "webp":
                            return "image/webp";
                        default:
                            return null;
                    }
                }
            }
        }
        return str;
    }

    public static int k(String str) {
        int iH = uya.h(str);
        if (iH == 4) {
            return 2;
        }
        return iH;
    }

    public static float m(b87 b87Var, c98 c98Var) {
        int i = b87Var.z;
        int i2 = b87Var.v;
        int i3 = b87Var.u;
        int i4 = i % 180;
        int i5 = i4 == 0 ? i3 : i2;
        int i6 = i4 == 0 ? i2 : i3;
        float f = 0.0f;
        for (int i7 = 0; i7 < c98Var.size(); i7++) {
            i36 i36Var = (i36) c98Var.get(i7);
            if (!(i36Var instanceof vm7)) {
                return -1.0f;
            }
            vm7 vm7Var = (vm7) i36Var;
            if (i36Var instanceof g1f) {
                float f2 = ((g1f) i36Var).a;
                if (f2 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f += f2;
                float f3 = f % 180.0f;
                i5 = f3 == 0.0f ? i3 : i2;
                i6 = f3 == 0.0f ? i2 : i3;
            } else if (!vm7Var.f(i5, i6)) {
                return -1.0f;
            }
        }
        float f4 = f % 360.0f;
        if (f4 % 90.0f == 0.0f) {
            return f4;
        }
        return -1.0f;
    }

    public abstract Object h();

    public String toString() {
        switch (this.a) {
            case 1:
                return h().toString();
            default:
                return super.toString();
        }
    }
}
