package androidpro.com.tcc_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botaoAcessar;
    private Button botaoCadastrar;
    private EditText campoEmail, campoSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaComponentes();
        botaoAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = campoEmail.getText().toString();
                String senha = campoEmail.getText().toString();

                if(!email.isEmpty()){
                    if (!senha.isEmpty()){

                    }else {
                        Toast.makeText(MainActivity.this,
                                "Preencha a Senha",
                                Toast.LENGTH_LONG).show();
                    }

                }else {
                    Toast.makeText(MainActivity.this,
                            "Preencha o E-mail!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    private void inicializaComponentes(){
        campoEmail = findViewById(R.id.editCadastroEmail);
        campoSenha = findViewById(R.id.editCadstroSenha);
        botaoAcessar = findViewById(R.id.buttonAcesso);
        botaoCadastrar = findViewById(R.id.buttonCadastro);
    }
}