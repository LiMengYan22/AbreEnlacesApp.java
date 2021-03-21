// En Principal.java:
public class Principal extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) 
      {
      super.onCreate(savedInstanceState);
      this.setContentView(R.layout.activity_principal);
        // METODO WEBVIEW:
      WebView myWebView = this.findViewById(R.id.webView);
        // Habilitar JavaScript:
      myWebView.getSettings().setJavaScriptEnabled(true);
        // Nuestro enlace URL:
      myWebView.loadUrl("https://webApp.com/index.php");
        // ABRE ENLACES URL EN APP:
      myWebView.setWebViewClient(new WebViewClient());
        // ABRE ENLACES URL EN APP.
      myWebView.setWebChromeClient(new WebChromeClient());
      WebSettings webSettings = myWebView.getSettings();
      webSettings.setDomStorageEnabled(false);
      }
