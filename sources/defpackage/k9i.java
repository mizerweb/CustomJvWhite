package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class k9i extends f83 {
    public static Font o(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : HttpStatus.SC_BAD_REQUEST, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iQ = q(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iQ2 = q(fontStyle, font2.getStyle());
            if (iQ2 < iQ) {
                font = font2;
                iQ = iQ2;
            }
        }
        return font;
    }

    public static FontFamily p(m77[] m77VarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (m77 m77Var : m77VarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(m77Var.b(), "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(m77Var.c()).setSlant(m77Var.d() ? 1 : 0).setTtcIndex(m77Var.a()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int q(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.f83
    public final Typeface f(Context context, j77 j77Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (k77 k77Var : j77Var.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, k77Var.a()).setWeight(k77Var.d()).setSlant(k77Var.e() ? 1 : 0).setTtcIndex(k77Var.b()).setFontVariationSettings(k77Var.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(o(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.f83
    public final Typeface g(Context context, m77[] m77VarArr, int i) {
        try {
            FontFamily fontFamilyP = p(m77VarArr, context.getContentResolver());
            if (fontFamilyP == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyP).setStyle(o(fontFamilyP, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.f83
    public final Typeface h(int i, Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyP = p((m77[]) list.get(0), contentResolver);
            if (fontFamilyP == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyP);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyP2 = p((m77[]) list.get(i2), contentResolver);
                if (fontFamilyP2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyP2);
                }
            }
            return customFallbackBuilder.setStyle(o(fontFamilyP, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.f83
    public final Typeface i(Context context, Resources resources, int i, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.f83
    public final Typeface j(Context context, Typeface typeface, int i) {
        return Typeface.create(typeface, i, false);
    }
}
