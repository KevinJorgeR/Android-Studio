package com.example.empresahuaral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class julio extends AppCompatActivity {

    private EditText blancoGrandeEditText;
    private EditText blancoMedianoEditText;
    private EditText blancoPequenoEditText;
    // DALIAS ROJAS
    private EditText RojoGrandeEditText;

    private EditText RojoMedianoEditText;

    private EditText RojoPequenoEditText;

    private EditText ColorGrandeEditText;
    private EditText ColorMedianoEditText;
    private EditText ColorPequenoEditText;

    // Declarar las vistas que necesitaremos para los precios
    private EditText precioBlancoGrandeEditText;
    private EditText precioBlancoMedianoEditText;
    private EditText precioBlancoPequenoEditText;
    private EditText precioRojoGrandeEditText;
    private EditText precioRojoMedianoEditText;
    private EditText precioRojoPequenoEditText;

    private EditText precioColorGrandeEditText;
    private EditText precioColorMedianoEditText;
    private EditText precioColorPequenoEditText;
    // Declarar las vistas que necesitaremos para las ganancias
    private TextView gananciaBlancoGrandeTextView;
    private TextView gananciaBlancoMedianoTextView;
    private TextView gananciaBlancoPequenoTextView;

    private TextView gananciaRojoGrandeTextView;

    private TextView gananciaRojoMedianoTextView;

    private TextView gananciaRojoPequenoTextView;

    private TextView gananciaColorGrandeTextView;
    private TextView gananciaColorMedianoTextView;
    private TextView gananciaColorPequenoTextView;
    // Declarar las vistas que necesitaremos para los botones de cálculo
    private Button btnCalcularBlancoGrande;
    private Button btnCalcularBlancoMediano;
    private Button btnCalcularBlancoPequeno;

    private Button btnCalcularRojoGrande;
    private Button btnCalcularRojoMediano;
    private Button btnCalcularRojoPequeno;

    private Button btnCalcularColorGrande;
    private Button btnCalcularColorMediano;
    private Button btnCalcularColorPequeno;
    // Declarar las variables para las ganancias
    private double gananciaBlancoGrande = 0;
    private double gananciaBlancoMediano = 0;
    private double gananciaBlancoPequeno = 0;

    private double gananciaRojoGrande = 0;
    private double gananciaRojoMediano = 0;
    private double gananciaRojoPequeno = 0;

    private double gananciaColorGrande = 0;
    private double gananciaColorMediano = 0;
    private double gananciaColorPequeno = 0;

    // Declarar las variables para los precios
    private double precioBlancoGrande = 0;
    private double precioBlancoMediano = 0;
    private double precioBlancoPequeno = 0;

    private double precioRojoGrande = 0;
    private double precioRojoMediano = 0;
    private double precioRojoPequeno = 0;

    private double precioColorGrande = 0;
    private double precioColorMediano = 0;
    private double precioColorPequeno = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_julio);
        // Inicializar las vistas para las cantidades de dalias
        blancoGrandeEditText = findViewById(R.id.blgrande);
        blancoMedianoEditText = findViewById(R.id.blmediano);
        blancoPequenoEditText = findViewById(R.id.blchico);
        RojoGrandeEditText = findViewById(R.id.rjgrande);
        RojoMedianoEditText = findViewById(R.id.rjmediano);
        RojoPequenoEditText = findViewById(R.id.rjchico);
        ColorGrandeEditText = findViewById(R.id.clgrande);
        ColorMedianoEditText = findViewById(R.id.clmediano);
        ColorPequenoEditText = findViewById(R.id.clchico);

        // Inicializar las vistas para los precios
        precioBlancoGrandeEditText = findViewById(R.id.monto1);
        precioBlancoMedianoEditText = findViewById(R.id.monto2);
        precioBlancoPequenoEditText = findViewById(R.id.monto3);
        precioRojoGrandeEditText = findViewById(R.id.monto4);
        precioRojoMedianoEditText = findViewById(R.id.monto5);
        precioRojoPequenoEditText = findViewById(R.id.monto6);
        precioColorGrandeEditText = findViewById(R.id.monto7);
        precioColorMedianoEditText = findViewById(R.id.monto8);
        precioColorPequenoEditText = findViewById(R.id.monto9);


        // Inicializar las vistas para las ganancias
        gananciaBlancoGrandeTextView = findViewById(R.id.ganancia1);
        gananciaBlancoMedianoTextView = findViewById(R.id.ganancia2);
        gananciaBlancoPequenoTextView = findViewById(R.id.ganancia3);
        gananciaRojoGrandeTextView = findViewById(R.id.ganancia4);
        gananciaRojoMedianoTextView = findViewById(R.id.ganancia5);
        gananciaRojoPequenoTextView = findViewById(R.id.ganancia6);
        gananciaColorGrandeTextView = findViewById(R.id.ganancia7);
        gananciaColorMedianoTextView = findViewById(R.id.ganancia8);
        gananciaColorPequenoTextView = findViewById(R.id.ganancia9);

        // Inicializar las vistas para los botones de cálculo
        btnCalcularBlancoGrande = findViewById(R.id.btnganancia);
        btnCalcularBlancoMediano = findViewById(R.id.btnganancia1);
        btnCalcularBlancoPequeno = findViewById(R.id.btnganancia2);
        btnCalcularRojoGrande = findViewById(R.id.btnganancia3);
        btnCalcularRojoMediano = findViewById(R.id.btnganancia4);
        btnCalcularRojoPequeno = findViewById(R.id.btnganancia5);
        btnCalcularColorGrande = findViewById(R.id.btnganancia6);
        btnCalcularColorMediano = findViewById(R.id.btnganancia7);
        btnCalcularColorPequeno = findViewById(R.id.btnganancia8);
    }
    // Método para calcular la ganancia del Blanco Grande
    public void calcularGananciaBlancoGrande(View view) {
        int cantidadBlancoGrande = Integer.parseInt(blancoGrandeEditText.getText().toString());
        precioBlancoGrande = Double.parseDouble(precioBlancoGrandeEditText.getText().toString());
        gananciaBlancoGrande = cantidadBlancoGrande * precioBlancoGrande;
        gananciaBlancoGrandeTextView.setText(String.format("S/. %.2f", gananciaBlancoGrande));
    }

    // Agregar más métodos para calcular las ganancias de las demás categorías
    // Método para calcular la ganancia del Blanco Mediano
    public void calcularGananciaBlancoMediano(View view) {
        int cantidadBlancoMediano = Integer.parseInt(blancoMedianoEditText.getText().toString());
        precioBlancoMediano = Double.parseDouble(precioBlancoMedianoEditText.getText().toString());
        gananciaBlancoMediano = cantidadBlancoMediano * precioBlancoMediano;
        gananciaBlancoMedianoTextView.setText(String.format("S/. %.2f", gananciaBlancoMediano));
    }

    // Método para calcular la ganancia del Blanco Pequeño
    public void calcularGananciaBlancoPequeno(View view) {
        int cantidadBlancoPequeno = Integer.parseInt(blancoPequenoEditText.getText().toString());
        precioBlancoPequeno = Double.parseDouble(precioBlancoPequenoEditText.getText().toString());
        gananciaBlancoPequeno = cantidadBlancoPequeno * precioBlancoPequeno;
        gananciaBlancoPequenoTextView.setText(String.format("S/. %.2f", gananciaBlancoPequeno));
    }

    public void calcularGananciaRojoGrande(View view) {
        int cantidadRojoGrande = Integer.parseInt(RojoGrandeEditText.getText().toString());
        precioRojoGrande = Double.parseDouble(precioRojoGrandeEditText.getText().toString());
        gananciaRojoGrande = cantidadRojoGrande * precioRojoGrande;
        gananciaRojoGrandeTextView.setText(String.format("S/. %.2f", gananciaRojoGrande));
    }

    // Método para calcular la ganancia del Rojo Mediano
    public void calcularGananciaRojoMediano(View view) {
        int cantidadRojoMediano = Integer.parseInt(RojoMedianoEditText.getText().toString());
        precioRojoMediano = Double.parseDouble(precioRojoMedianoEditText.getText().toString());
        gananciaRojoMediano = cantidadRojoMediano * precioRojoMediano;
        gananciaRojoMedianoTextView.setText(String.format("S/. %.2f", gananciaRojoMediano));
    }

    // Método para calcular la ganancia del Rojo Pequeño

    public void calcularGananciaRojoPequeno(View view) {
        int cantidadRojoPequeno = Integer.parseInt(RojoPequenoEditText.getText().toString());
        precioRojoPequeno = Double.parseDouble(precioRojoPequenoEditText.getText().toString());
        gananciaRojoPequeno = cantidadRojoPequeno * precioRojoPequeno;
        gananciaRojoPequenoTextView.setText(String.format("S/. %.2f", gananciaRojoPequeno));
    }

    public void calcularGananciaColorGrande(View view) {
        int cantidadColorGrande = Integer.parseInt(ColorGrandeEditText.getText().toString());
        precioColorGrande = Double.parseDouble(precioColorGrandeEditText.getText().toString());
        gananciaColorGrande = cantidadColorGrande * precioColorGrande;
        gananciaColorGrandeTextView.setText(String.format("S/. %.2f", gananciaColorGrande));
    }

    // Método para calcular la ganancia del Color Mediano
    public void calcularGananciaColorMediano(View view) {
        int cantidadColorMediano = Integer.parseInt(ColorMedianoEditText.getText().toString());
        precioColorMediano = Double.parseDouble(precioColorMedianoEditText.getText().toString());
        gananciaColorMediano = cantidadColorMediano * precioColorMediano;
        gananciaColorMedianoTextView.setText(String.format("S/. %.2f", gananciaColorMediano));
    }

    // Método para calcular la ganancia del Color Pequeño
    public void calcularGananciaColorPequeno(View view) {
        int cantidadColorPequeno = Integer.parseInt(ColorPequenoEditText.getText().toString());
        precioColorPequeno = Double.parseDouble(precioColorPequenoEditText.getText().toString());
        gananciaColorPequeno = cantidadColorPequeno * precioColorPequeno;
        gananciaColorPequenoTextView.setText(String.format("S/. %.2f", gananciaColorPequeno));
    }

    // Método para calcular el total de ganancias después de aplicar un descuento
    public void calcularTotalGanancias(View view) {
        double totalGanancias = 0;

        // Sumar todas las ganancias calculadas previamente
        totalGanancias += gananciaBlancoGrande;
        totalGanancias += gananciaBlancoMediano;
        totalGanancias += gananciaBlancoPequeno;
        totalGanancias += gananciaRojoGrande;
        totalGanancias += gananciaRojoMediano;
        totalGanancias += gananciaRojoPequeno;
        totalGanancias += gananciaColorGrande;
        totalGanancias += gananciaColorMediano;
        totalGanancias += gananciaColorPequeno;

        // Obtener el descuento ingresado por el usuario
        EditText descuentoEditText = findViewById(R.id.descuento);
        String descuentoString = descuentoEditText.getText().toString();

        // Verificar que se haya ingresado un valor para el descuento
        if (!descuentoString.isEmpty()) {
            double descuento = Double.parseDouble(descuentoString);
            // Restar el descuento al total de ganancias
            totalGanancias -= descuento;
        }

        // Mostrar el resultado en una vista de texto
        TextView totalGananciasTextView = findViewById(R.id.totalganancia);
        totalGananciasTextView.setText(String.format("S/. %.2f", totalGanancias));
    }
}