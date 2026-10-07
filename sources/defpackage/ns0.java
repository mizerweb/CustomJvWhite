package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RuntimeShader;
import android.os.Build;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ns0 extends FrameLayout {
    public final boolean a;
    public final ks9 b;
    public final ny8 c;
    public gn7 d;
    public boolean e;

    public ns0(Context context) {
        super(context, null, 0);
        boolean z = Build.VERSION.SDK_INT >= 33;
        this.a = z;
        this.b = new ks9(3, this);
        this.c = rx8.P(3, new qo7(19, this));
        if (z) {
            setWillNotDraw(false);
        }
    }

    private final xe getAgslDelegate() {
        return (xe) this.c.getValue();
    }

    public abstract void a(we weVar, float f, float f2);

    public final void b() {
        if (this.e) {
            if (this.a) {
                invalidate();
                return;
            }
            gn7 gn7Var = this.d;
            if (gn7Var != null) {
                gn7Var.a();
            }
        }
    }

    public final void c() {
        String str;
        this.e = true;
        if (!this.a) {
            if (this.d == null) {
                gn7 gn7Var = new gn7(getContext(), this.b);
                this.d = gn7Var;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                addView(gn7Var, layoutParams);
            }
            gn7 gn7Var2 = this.d;
            if (gn7Var2 != null) {
                gn7Var2.setStarted(true);
                return;
            }
            return;
        }
        xe agslDelegate = getAgslDelegate();
        ks9 ks9Var = agslDelegate.a;
        if (agslDelegate.b != null) {
            return;
        }
        WeakReference weakReference = (WeakReference) xe.g.remove(((ns0) ks9Var.b).getSpec().getClass());
        RuntimeShader runtimeShaderB = weakReference != null ? ve.b(weakReference.get()) : null;
        agslDelegate.b = runtimeShaderB;
        if (runtimeShaderB == null) {
            ny8 ny8Var = rwf.a;
            qbi spec = ((ns0) ks9Var.b).getSpec();
            StringBuilder sb = new StringBuilder("uniform float2 resolution;\n\n");
            for (rbi rbiVar : ((zpe) spec).x()) {
                int iD = qt4.D(rbiVar.b);
                if (iD == 0) {
                    str = "float";
                } else if (iD == 1) {
                    str = "float2";
                } else {
                    if (iD != 2) {
                        ore.o();
                        return;
                    }
                    str = "float4";
                }
                sb.append(nbh.w("uniform ", str, " ", rbiVar.a, ";"));
                sb.append('\n');
            }
            sb.append('\n');
            ny8 ny8Var2 = rwf.a;
            sb.append(((lge) ny8Var2.getValue()).c("\n        float dither(vec2 p) {\n            return fract(sin(dot(p, vec2(12.9898, 78.233))) * 43758.5453);\n        }\n\n        float getCircle(vec2 p, vec2 center, float radius, float blur) {\n            float d = length(p - center);\n            return smoothstep(radius + blur, radius - blur, d);\n        }\n\n        vec2 getOffset(float angle, float radius) {\n            return vec2(cos(angle), sin(angle)) * radius;\n        }\n    ", new chf(8)));
            sb.append("\n\nfloat4 main(float2 fragCoord) {\n    float2 uv = fragCoord / resolution;\n\n    float2 pixelPos = float2(\n        fragCoord.x - resolution.x * 0.5,\n        resolution.y * 0.5 - fragCoord.y\n    );\n\n");
            sb.append(((lge) ny8Var2.getValue()).c("\n        // Layer 3 (Universe) - large background circle\n        float m3 = getCircle(pixelPos, vec2(0.0), circle3Radius, blur3);\n\n        // Layer 2 (Planets) - 4 orbiting circles\n        // Single trig call per layer: derive 4 positions via component swap/negate\n        vec2 offset2 = getOffset(-centers2Angle, centers2Radius);\n\n        float m2_c2 = getCircle(pixelPos, vec2(-offset2.y, offset2.x), circle2Radius, blur2);\n        float m2_c3 = getCircle(pixelPos, offset2, circle2Radius, blur2);\n        float m2_c4 = getCircle(pixelPos, vec2(offset2.y, -offset2.x), circle2Radius, blur2);\n        float m2_c5 = getCircle(pixelPos, -offset2, circle2Radius, blur2);\n\n        // Render planets (bottom to top) with pure colors\n        vec4 layer2Final = c5;\n        layer2Final = mix(layer2Final, c4, m2_c4);\n        layer2Final = mix(layer2Final, c3, m2_c3);\n        layer2Final = mix(layer2Final, c2, m2_c2);\n        float mask2 = clamp(m2_c2 + m2_c3 + m2_c4 + m2_c5, 0.0, 1.0) * alpha2;\n\n        // Layer 1 (Sputniks) - 2 inner circles\n        vec2 offset1 = getOffset(-centers1Angle, centers1Radius);\n\n        float m1_sput1 = getCircle(pixelPos, -offset1, circle1Radius, blur1);\n        float m1_sput2 = getCircle(pixelPos, offset1, circle1Radius, blur1);\n\n        vec4 layer1Final = mix(c7, c6, m1_sput1);\n        float mask1 = clamp(m1_sput1 + m1_sput2, 0.0, 1.0) * alpha1;\n\n        // Compose all layers\n        // Alpha is multiplied into mask — controls transparency, not color darkness\n        vec4 scene = bgColor;\n        scene = mix(scene, c1, m3 * alpha3);\n        scene = mix(scene, layer2Final, mask2);\n        scene = mix(scene, layer1Final, mask1);\n\n        // Global vignette (softened)\n        // vignetteScale corrects aspect ratio: (1,1) = UV-based ellipse, (1, h/w) = circular\n        float dist = length((uv - 0.5) * vignetteScale) * 1.2;\n        float vignette = pow(clamp(1.0 - dist, 0.0, 1.0), falloff * 0.3);\n\n        vec4 finalColor = mix(bgColor, scene, vignette);\n\n        // Dithering to reduce banding\n        finalColor.rgb += (dither(uv) - 0.5) * (2.0 / 255.0);\n    ", new chf(8)));
            sb.append("\n\n    return finalColor;\n}\n");
            agslDelegate.b = ve.c(sb.toString());
        }
    }

    public final void d() {
        this.e = false;
        if (!this.a) {
            gn7 gn7Var = this.d;
            if (gn7Var != null) {
                gn7Var.setStarted(false);
                return;
            }
            return;
        }
        xe agslDelegate = getAgslDelegate();
        ((Paint) agslDelegate.c.getValue()).setShader(null);
        RuntimeShader runtimeShader = agslDelegate.b;
        if (runtimeShader == null) {
            return;
        }
        agslDelegate.b = null;
        xe.g.put(((ns0) agslDelegate.a.b).getSpec().getClass(), new WeakReference(runtimeShader));
    }

    public abstract qbi getSpec();

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        if (this.e && this.a && canvas.isHardwareAccelerated()) {
            xe agslDelegate = getAgslDelegate();
            RuntimeShader runtimeShader = getAgslDelegate().b;
            if (runtimeShader == null) {
                return;
            }
            float width = getWidth();
            float height = getHeight();
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            float[] fArr = agslDelegate.e;
            ny8 ny8Var = agslDelegate.c;
            fArr[0] = width;
            fArr[1] = height;
            runtimeShader.setFloatUniform("resolution", fArr);
            a((we) agslDelegate.f.getValue(), width, height);
            ((Paint) ny8Var.getValue()).setShader(runtimeShader);
            canvas.drawPaint((Paint) ny8Var.getValue());
        }
    }
}
