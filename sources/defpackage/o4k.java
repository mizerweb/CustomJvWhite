package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o4k extends ugk {
    private static final String VERTEX_SOURCE = "precision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n   vTextureCoord = (texMatrix * aTextureCoord).xy;\n}\n";
}
