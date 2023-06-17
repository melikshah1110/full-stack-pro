import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import { ChakraProvider, createStandaloneToast } from '@chakra-ui/react'
import './index.css'

const { ToastContainer, toast } = createStandaloneToast()

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
      <ChakraProvider>
            <App />
            <ToastContainer/>
      </ChakraProvider>
  </React.StrictMode>,
)
